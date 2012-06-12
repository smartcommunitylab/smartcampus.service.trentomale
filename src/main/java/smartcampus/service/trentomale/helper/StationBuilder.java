package smartcampus.service.trentomale.helper;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;

import smartcampus.service.trentomale.wsclient.ArrayOfStation;
import smartcampus.service.trentomale.wsclient.ArrayOfTrain;
import smartcampus.service.trentomale.wsclient.Station;
import smartcampus.service.trentomale.wsclient.StationStop;
import smartcampus.service.trentomale.wsclient.Train;
import smartcampus.service.trentomale.wsclient.TrainListTransport;
import smartcampus.service.trentomale.wsclient.TrainViewService;
import smartcampus.service.trentomale.wsclient.TrainViewService_Service;

import com.google.protobuf.Message;

public class StationBuilder {

	public static List<Message> buildStations(String stationsList) throws DatatypeConfigurationException {
		TrainViewService_Service service = new TrainViewService_Service();
    TrainViewService port = service.getBasicHttpBindingTrainViewService();
    BindingProvider bp = (BindingProvider) port;
    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://trainview.algorab.net/TrainViewService.svc");
    GregorianCalendar gcal = new GregorianCalendar();
    ArrayOfStation stationsArray = port.getStations();
    
    String stats[] = stationsList.split(",");
    List<String> inputStations = Arrays.asList(stats);
    
    List<Integer> inputStationsId = new ArrayList<Integer>();
    Map<Integer, String> stationsId = new TreeMap<Integer, String>();
    MultiMap stationsTimes = new MultiHashMap();
    
    for(Station station : stationsArray.getStation()) {
    	stationsId.put(station.getStationId(), station.getName().getValue());

    	if (inputStations.contains(station.getName().getValue())) {
    		inputStationsId.add(station.getStationId());
    	}
    }
    XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);    
    TrainListTransport list = port.getTrains(xgcal);
    ArrayOfTrain trainsArray = list.getTrains().getValue();
    List<Message> result = new ArrayList<Message>();
    
    MultiMap tmpTrains = new MultiHashMap();
    
    for(Train train : trainsArray.getTrain()) {
    	int lastStopN = train.getNextStops().getValue().getStationStop().size() - 1;
    	StationStop lastStop = train.getNextStops().getValue().getStationStop().get(lastStopN);
    	for (StationStop stop: train.getNextStops().getValue().getStationStop()) {
    		
    		smartcampus.service.trentomale.data.message.Trentomale.Station.Builder stationBuilder = smartcampus.service.trentomale.data.message.Trentomale.Station.newBuilder();
    		stationBuilder.setName((String)stationsId.get(stop.getStationId()));
    		
    		if (inputStationsId.contains(stop.getStationId())) {
    			stationsTimes.put(stationsId.get(stop.getStationId()), stop.getArrivalHour() + ":" + stop.getArrivalMinute());
    			
    			smartcampus.service.trentomale.data.message.Trentomale.Train.Builder trainBuilder = smartcampus.service.trentomale.data.message.Trentomale.Train.newBuilder();
    			trainBuilder.setId(train.getTrainId());
    			trainBuilder.setNumber(train.getTrainNumber());
    			trainBuilder.setDelay(train.getCurrentDelay());
    			String minute = "" + stop.getArrivalMinute();
    			minute = (minute.length() < 2)?("0" + minute):minute;
    			trainBuilder.setTime(stop.getArrivalHour() + ":" + minute);
    			trainBuilder.setDirection(stationsId.get(lastStop.getStationId()));

    			smartcampus.service.trentomale.data.message.Trentomale.Train trainProto = trainBuilder.build();
    			
    			tmpTrains.put(stop.getStationId(), trainBuilder.build());
    		}
    	}
    }
    
    for (Integer stationId: inputStationsId) {
  		smartcampus.service.trentomale.data.message.Trentomale.Station.Builder stationBuilder = smartcampus.service.trentomale.data.message.Trentomale.Station.newBuilder();
  		stationBuilder.setName((String)stationsId.get(stationId));
  		stationBuilder.addAllTrain((List)tmpTrains.get(stationId));
  		result.add(stationBuilder.build());
    }
    
//    System.out.println(stationsId);
    
    return result;
	}
	
}
