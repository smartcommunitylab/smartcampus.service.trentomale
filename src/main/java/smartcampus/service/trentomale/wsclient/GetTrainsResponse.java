
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
 *         &lt;element name="GetTrainsResult" type="{http://schemas.datacontract.org/2004/07/TrainView.Web}TrainListTransport" minOccurs="0"/>
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
    "getTrainsResult"
})
@XmlRootElement(name = "GetTrainsResponse", namespace = "TrainViewServiceNs")
public class GetTrainsResponse {

    @XmlElementRef(name = "GetTrainsResult", namespace = "TrainViewServiceNs", type = JAXBElement.class)
    protected JAXBElement<TrainListTransport> getTrainsResult;

    /**
     * Gets the value of the getTrainsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrainListTransport }{@code >}
     *     
     */
    public JAXBElement<TrainListTransport> getGetTrainsResult() {
        return getTrainsResult;
    }

    /**
     * Sets the value of the getTrainsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrainListTransport }{@code >}
     *     
     */
    public void setGetTrainsResult(JAXBElement<TrainListTransport> value) {
        this.getTrainsResult = ((JAXBElement<TrainListTransport> ) value);
    }

}
