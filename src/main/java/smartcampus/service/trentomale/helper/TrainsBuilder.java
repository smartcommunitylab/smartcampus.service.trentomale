package smartcampus.service.trentomale.helper;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.codehaus.jackson.map.ObjectMapper;

import smartcampus.service.trentomale.data.message.Trentomale.Train;

import com.google.protobuf.Message;

public class TrainsBuilder {

	private static Stazione[] stazioni = { new Stazione(147,1,"Trento"), new Stazione(2159,3,"Trento Nord"), new Stazione(4323,4,"Gardolo"), new Stazione(5656,5,"Zona industriale"), new Stazione(6400,6,"Lamar"), new Stazione(7741,7,"Lavis"), new Stazione(9538,8,"Zambana"), new Stazione(11685,9,"Nave s. Felice"), new Stazione(14834,11,"Grumo s. Michele"), new Stazione(16500,12,"Mezzocorona F."), new Stazione(17750,13,"Mezzocorona B."), new Stazione(19736,14,"Mezzolombardo"), new Stazione(23457,15,"Masi di Vigo"), new Stazione(24278,16,"Crescino"), new Stazione(26551,17,"Denno"), new Stazione(31524,19,"Mollaro"), new Stazione(32625,20,"Segno"), new Stazione(34711,21,"Taio"), new Stazione(36516,22,"Dermulo"), new Stazione(38007,23,"Tassullo"), new Stazione(41607,24,"Cles"), new Stazione(42541,25,"Cles p. scolastico"), new Stazione(45880,26,"Mostizzolo"), new Stazione(48137,27,"Bozzana"), new Stazione(49397,28,"Tozzaga"), new Stazione(50416,29,"Cassana"), new Stazione(51407,30,"Cavizzana"), new Stazione(52201,31,"Caldes"), new Stazione(54095,32,"Terzolas"), new Stazione(55493,33,"Malé"), new Stazione(56953,34,"Croviana"), new Stazione(58813,35,"Monclassico"), new Stazione(60186,36,"Dimaro - Presson"), new Stazione(62365,37,"Mastellina"), new Stazione(63385,38,"Daolasa"), new Stazione(64093,39,"Piano"), new Stazione(65299,40,"Marilleva 900")};
	private static Map<Integer, Stazione> stazioniMap;
	
	static {
		stazioniMap = new TreeMap<Integer, Stazione>();
		for (Stazione stazione: stazioni) {
			stazioniMap.put(stazione.getId(), stazione);
		}
		}
	
	public static List<Message> buildTrains() throws Exception {
		List<Message> result = new ArrayList<Message>();

		ObjectMapper mapper = new ObjectMapper();

		Orari orari = mapper.readValue(new URL(
				"http://trainview.algorab.net/Ddati.ashx"), Orari.class);
		Treni treni = mapper.readValue(new URL(
				"http://trainview.algorab.net/Tdati.ashx"), Treni.class);

		for (Treno treno : treni.getTreni()) {
			Train.Builder builder = Train.newBuilder();
			Stazione stazione = findNearest(treno);

			builder.setId(treno.getTrainId());
			builder.setNumber(treno.getTrainNumber());
			builder.setStation(stazione.getName());
			builder.setDelay(treno.getCurrentDelay());

			System.out.println(">" + treno.getTrainId());
			boolean time = false;
			String last = null;
			for (Orario orario : orari.getOrari()) {
				if (!orario.getC_train().equals(treno.getTrainId())) {
					continue;
				}
				last = stazioniMap.get(orario.getC_stop()).getName();
				if (!time) {
					for (int inc : new int[] { 0, -1, 1 }) {
						if (!time
								&& orario.getC_stop().intValue() + inc == stazione
										.getId()) {
							builder.setTime(orario.getI_hours() + ":"
									+ orario.getI_minutes());
							time = true;
							break;
						}
					}
				}
			}

			builder.setDirection(last);
			result.add(builder.build());
		}

		return result;
	}
	
	private static Stazione findNearest(Treno treno) {
		Stazione nearest = null;
		long distance = Long.MAX_VALUE;
		for (Stazione stazione: stazioni) {
			int d = Math.abs(treno.getPosition() - stazione.getPosition());
			if (d < distance) {
				distance = d;
				nearest = stazione;
			}
		}
		
		return nearest;
	}
	
	
}
