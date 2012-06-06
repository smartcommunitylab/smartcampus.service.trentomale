
package smartcampus.service.trentomale.wsclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GertServerTimeResult" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "gertServerTimeResult"
})
@XmlRootElement(name = "GertServerTimeResponse", namespace = "TrainViewServiceNs")
public class GertServerTimeResponse {

    @XmlElement(name = "GertServerTimeResult", namespace = "TrainViewServiceNs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gertServerTimeResult;

    /**
     * Gets the value of the gertServerTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGertServerTimeResult() {
        return gertServerTimeResult;
    }

    /**
     * Sets the value of the gertServerTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGertServerTimeResult(XMLGregorianCalendar value) {
        this.gertServerTimeResult = value;
    }

}
