
package smartcampus.service.trentomale.wsclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStationStop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStationStop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StationStop" type="{http://schemas.datacontract.org/2004/07/TrainView.Web}StationStop" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStationStop", propOrder = {
    "stationStop"
})
public class ArrayOfStationStop {

    @XmlElement(name = "StationStop", nillable = true)
    protected List<StationStop> stationStop;

    /**
     * Gets the value of the stationStop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationStop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationStop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationStop }
     * 
     * 
     */
    public List<StationStop> getStationStop() {
        if (stationStop == null) {
            stationStop = new ArrayList<StationStop>();
        }
        return this.stationStop;
    }

}
