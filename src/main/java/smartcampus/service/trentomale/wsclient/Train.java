
package smartcampus.service.trentomale.wsclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Train complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Train">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nextStops" type="{http://schemas.datacontract.org/2004/07/TrainView.Web}ArrayOfStationStop" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="trainId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="trainNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Train", propOrder = {
    "currentDelay",
    "nextStops",
    "position",
    "trainId",
    "trainNumber"
})
public class Train {

    protected Integer currentDelay;
    @XmlElementRef(name = "nextStops", namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStationStop> nextStops;
    protected Integer position;
    protected Integer trainId;
    protected Integer trainNumber;

    /**
     * Gets the value of the currentDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentDelay() {
        return currentDelay;
    }

    /**
     * Sets the value of the currentDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentDelay(Integer value) {
        this.currentDelay = value;
    }

    /**
     * Gets the value of the nextStops property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStationStop }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStationStop> getNextStops() {
        return nextStops;
    }

    /**
     * Sets the value of the nextStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStationStop }{@code >}
     *     
     */
    public void setNextStops(JAXBElement<ArrayOfStationStop> value) {
        this.nextStops = ((JAXBElement<ArrayOfStationStop> ) value);
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the trainId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainId() {
        return trainId;
    }

    /**
     * Sets the value of the trainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainId(Integer value) {
        this.trainId = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainNumber(Integer value) {
        this.trainNumber = value;
    }

}
