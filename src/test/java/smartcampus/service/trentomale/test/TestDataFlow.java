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
import it.sayservice.platform.core.common.exception.EntityNotFoundException;
import it.sayservice.platform.core.common.exception.ServiceException;
import it.sayservice.platform.servicebus.test.DataFlowTestHelper;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import smartcampus.service.trentomale.impl.TrainsTrentoMaleDataFlow;

import com.google.protobuf.InvalidProtocolBufferException;

public class TestDataFlow extends TestCase {
	public void testRun() throws PersistenceException, EntityNotFoundException, InvalidProtocolBufferException, ServiceException {
		
		DataFlowTestHelper helper = new DataFlowTestHelper();

		Map<String, Object> parameters = new HashMap<String, Object>();

		Map<String, Object> out = helper.executeDataFlow(
				"smartcampus.service.TrentoMale", "TrainsTrentoMale", new TrainsTrentoMaleDataFlow(), parameters);
		System.err.println(out);
	}

}
