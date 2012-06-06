/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcampus.service.trentomale.helper;


import java.util.ArrayList;
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



/**
 *
 * @author Tar
 */
public class TrainView {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws DatatypeConfigurationException {
    TrainViewService_Service service = new TrainViewService_Service();
    TrainViewService port = service.getBasicHttpBindingTrainViewService();
    BindingProvider bp = (BindingProvider) port;
    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://trainview.algorab.net/TrainViewService.svc");
    GregorianCalendar gcal = new GregorianCalendar();
    ArrayOfStation stationsArray = port.getStations();
    
    List<String> inputStations = new ArrayList<String>();
    inputStations.add("Trento");
    inputStations.add("Trento Nord");
    inputStations.add("Gardolo");
    
    Map<Integer, String> stationsId = new TreeMap<Integer, String>();
    MultiMap stationsTimes = new MultiHashMap();
    
    
    
    for(Station station : stationsArray.getStation()) {
//      System.out.println(String.format("%s - %s - %s", station.getStationId(), station.getKm(), station.getName().getValue()));
    	if (inputStations.contains(station.getName().getValue())) {
    		stationsId.put(station.getStationId(), station.getName().getValue());
    	}
    }
    XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);    
    TrainListTransport list = port.getTrains(xgcal);
    ArrayOfTrain trainsArray = list.getTrains().getValue();
    for(Train train : trainsArray.getTrain()) {
//      System.out.println(String.format("%s - %s - %s - %s", train.getTrainId(), train.getTrainNumber(), train.getPosition(), train.getCurrentDelay()));
    	System.out.println(train.getTrainId());
    	for (StationStop stop: train.getNextStops().getValue().getStationStop()) {
    		if (stationsId.containsKey(stop.getStationId())) {
    			System.out.println(String.format("\t%s=%s:%s", stationsId.get(stop.getStationId()), stop.getArrivalHour(), stop.getArrivalMinute()));
    			stationsTimes.put(stationsId.get(stop.getStationId()), stop.getArrivalHour() + ":" + stop.getArrivalMinute());
    		}
    	}
    }
    
    for (Object station: stationsTimes.keySet()) {
    	Collections.sort((List)stationsTimes.get(station));
    }
    
    System.out.println(stationsTimes);
    
  }
  
  public static void oldMain(String[] args) throws DatatypeConfigurationException {
    TrainViewService_Service service = new TrainViewService_Service();
    TrainViewService port = service.getBasicHttpBindingTrainViewService();
    BindingProvider bp = (BindingProvider) port;
    bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://trainview.algorab.net/TrainViewService.svc");
    GregorianCalendar gcal = new GregorianCalendar();
    ArrayOfStation stationsArray = port.getStations();
    for(Station station : stationsArray.getStation()) {
      System.out.println(String.format("%s - %s - %s", station.getStationId(), station.getKm(), station.getName().getValue()));
    }
    XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);    
    TrainListTransport list = port.getTrains(xgcal);
    ArrayOfTrain trainsArray = list.getTrains().getValue();
    for(Train train : trainsArray.getTrain()) {
      System.out.println(String.format("%s - %s - %s - %s", train.getTrainId(), train.getTrainNumber(), train.getPosition(), train.getCurrentDelay()));
    }
  }
  
}
