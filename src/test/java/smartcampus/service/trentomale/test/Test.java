package smartcampus.service.trentomale.test;

import javax.xml.datatype.DatatypeConfigurationException;

import smartcampus.service.trentomale.helper.StationBuilder;
import smartcampus.service.trentomale.helper.TrainsBuilder;

import junit.framework.TestCase;

public class Test extends TestCase {

	public void test() throws DatatypeConfigurationException {
//		System.out.println(StationBuilder.buildStations("Trento,Cles"));
		
		System.out.println(TrainsBuilder.buildTrains());
	}
	
}
