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
package smartcampus.service.trentomale.test;

import it.sayservice.platform.core.bus.common.exception.PersistenceException;
import it.sayservice.platform.core.bus.service.handler.BusServiceHandler;
import it.sayservice.platform.core.bus.service.persistence.PersistenceEngine;
import it.sayservice.platform.core.common.exception.EntityNotFoundException;
import it.sayservice.platform.core.common.exception.ServiceException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.protobuf.InvalidProtocolBufferException;

public class TestDataFlow extends TestCase {
	public void testRun() throws PersistenceException, EntityNotFoundException, InvalidProtocolBufferException {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "/test-context.xml", "/applicationContext.xml" });
		assertNotNull(context);
		PersistenceEngine persistenceEngine = (PersistenceEngine) context.getBean("busPersistenceEngineDAO");
		assertNotNull(persistenceEngine);

		BusServiceHandler busServiceHandler = (BusServiceHandler) context.getBean("busServiceHandler");
		assertNotNull(busServiceHandler);
		busServiceHandler.start();

		 System.out.println("Waiting...");
		 Scanner in = new Scanner(System.in);
		 in.nextLine();

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("stationsList", "Trento,Trento Nord,Gardolo");
		Object object = null;
		try {
			object = busServiceHandler.invokeService("smartcampus.service.TrentoMale", "TimeTableTrentoMale", parameters, null);
			System.out.println(object);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		assertTrue(true);

	}

}
