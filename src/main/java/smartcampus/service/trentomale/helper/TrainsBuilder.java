/*******************************************************************************
 * Copyright 2012-2013 Trento RISE
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
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

public class TrainsBuilder {

	public static List<Message> buildTrains() throws DatatypeConfigurationException {
		TrainViewService_Service service = new TrainViewService_Service();
		TrainViewService port = service.getBasicHttpBindingTrainViewService();
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://trainview.algorab.net/TrainViewService.svc");
		GregorianCalendar gcal = new GregorianCalendar();
		ArrayOfStation stationsArray = port.getStations();


		List<Integer> inputStationsId = new ArrayList<Integer>();
		Map<Integer, String> stationsId = new TreeMap<Integer, String>();
		MultiMap stationsTimes = new MultiHashMap();

		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
		TrainListTransport list = port.getTrains(xgcal);
		ArrayOfTrain trainsArray = list.getTrains().getValue();
		List<Message> result = new ArrayList<Message>();

		MultiMap tmpTrains = new MultiHashMap();

		for (Train train : trainsArray.getTrain()) {
			int lastStopN = train.getNextStops().getValue().getStationStop().size() - 1;
			StationStop lastStop = train.getNextStops().getValue().getStationStop().get(lastStopN);
			smartcampus.service.trentomale.data.message.Trentomale.Train.Builder trainBuilder = smartcampus.service.trentomale.data.message.Trentomale.Train.newBuilder();
			trainBuilder.setId(train.getTrainId());
			trainBuilder.setNumber(train.getTrainNumber());
			trainBuilder.setDelay(train.getCurrentDelay());
//			String minute = "" + stop.getArrivalMinute();
//			minute = (minute.length() < 2) ? ("0" + minute) : minute;
//			trainBuilder.setTime(stop.getArrivalHour() + ":" + minute);
//			trainBuilder.setDirection(stationsId.get(lastStop.getStationId()));

			smartcampus.service.trentomale.data.message.Trentomale.Train trainProto = trainBuilder.build();

			result.add(trainProto);
		}

		return result;
	}

}
