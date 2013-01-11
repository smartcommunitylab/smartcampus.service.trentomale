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
package smartcampus.service.trentomale.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetStationsResult" type="{http://schemas.datacontract.org/2004/07/TrainView.Web}ArrayOfStation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStationsResult"
})
@XmlRootElement(name = "GetStationsResponse", namespace = "TrainViewServiceNs")
public class GetStationsResponse {

    @XmlElementRef(name = "GetStationsResult", namespace = "TrainViewServiceNs", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStation> getStationsResult;

    /**
     * Gets the value of the getStationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStation> getGetStationsResult() {
        return getStationsResult;
    }

    /**
     * Sets the value of the getStationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     *     
     */
    public void setGetStationsResult(JAXBElement<ArrayOfStation> value) {
        this.getStationsResult = ((JAXBElement<ArrayOfStation> ) value);
    }

}
