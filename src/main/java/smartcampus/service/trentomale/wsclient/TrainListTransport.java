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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrainListTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainListTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="serverTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="trains" type="{http://schemas.datacontract.org/2004/07/TrainView.Web}ArrayOfTrain" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainListTransport", propOrder = {
    "hasChanges",
    "serverTime",
    "trains"
})
public class TrainListTransport {

    protected Boolean hasChanges;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serverTime;
    @XmlElementRef(name = "trains", namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTrain> trains;

    /**
     * Gets the value of the hasChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChanges() {
        return hasChanges;
    }

    /**
     * Sets the value of the hasChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChanges(Boolean value) {
        this.hasChanges = value;
    }

    /**
     * Gets the value of the serverTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServerTime() {
        return serverTime;
    }

    /**
     * Sets the value of the serverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServerTime(XMLGregorianCalendar value) {
        this.serverTime = value;
    }

    /**
     * Gets the value of the trains property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTrain }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTrain> getTrains() {
        return trains;
    }

    /**
     * Sets the value of the trains property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTrain }{@code >}
     *     
     */
    public void setTrains(JAXBElement<ArrayOfTrain> value) {
        this.trains = ((JAXBElement<ArrayOfTrain> ) value);
    }

}
