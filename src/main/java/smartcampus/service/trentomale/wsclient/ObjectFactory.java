
package smartcampus.service.trentomale.wsclient;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the smartcampus.service.trentomale.wsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfStationStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "ArrayOfStationStop");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Train_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "Train");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfStation_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "ArrayOfStation");
    private final static QName _StationStop_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "StationStop");
    private final static QName _TrainListTransport_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "TrainListTransport");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfTrain_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "ArrayOfTrain");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Station_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "Station");
    private final static QName _StationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "name");
    private final static QName _GetStationsResponseGetStationsResult_QNAME = new QName("TrainViewServiceNs", "GetStationsResult");
    private final static QName _TrainNextStops_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "nextStops");
    private final static QName _TrainListTransportTrains_QNAME = new QName("http://schemas.datacontract.org/2004/07/TrainView.Web", "trains");
    private final static QName _GetTrainsResponseGetTrainsResult_QNAME = new QName("TrainViewServiceNs", "GetTrainsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: smartcampus.service.trentomale.wsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GertServerTimeResponse }
     * 
     */
    public GertServerTimeResponse createGertServerTimeResponse() {
        return new GertServerTimeResponse();
    }

    /**
     * Create an instance of {@link GetTrains }
     * 
     */
    public GetTrains createGetTrains() {
        return new GetTrains();
    }

    /**
     * Create an instance of {@link GetStationsResponse }
     * 
     */
    public GetStationsResponse createGetStationsResponse() {
        return new GetStationsResponse();
    }

    /**
     * Create an instance of {@link Train }
     * 
     */
    public Train createTrain() {
        return new Train();
    }

    /**
     * Create an instance of {@link StationStop }
     * 
     */
    public StationStop createStationStop() {
        return new StationStop();
    }

    /**
     * Create an instance of {@link TrainListTransport }
     * 
     */
    public TrainListTransport createTrainListTransport() {
        return new TrainListTransport();
    }

    /**
     * Create an instance of {@link GertServerTime }
     * 
     */
    public GertServerTime createGertServerTime() {
        return new GertServerTime();
    }

    /**
     * Create an instance of {@link GetTrainsResponse }
     * 
     */
    public GetTrainsResponse createGetTrainsResponse() {
        return new GetTrainsResponse();
    }

    /**
     * Create an instance of {@link GetStations }
     * 
     */
    public GetStations createGetStations() {
        return new GetStations();
    }

    /**
     * Create an instance of {@link ArrayOfStation }
     * 
     */
    public ArrayOfStation createArrayOfStation() {
        return new ArrayOfStation();
    }

    /**
     * Create an instance of {@link Station }
     * 
     */
    public Station createStation() {
        return new Station();
    }

    /**
     * Create an instance of {@link ArrayOfTrain }
     * 
     */
    public ArrayOfTrain createArrayOfTrain() {
        return new ArrayOfTrain();
    }

    /**
     * Create an instance of {@link ArrayOfStationStop }
     * 
     */
    public ArrayOfStationStop createArrayOfStationStop() {
        return new ArrayOfStationStop();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "ArrayOfStationStop")
    public JAXBElement<ArrayOfStationStop> createArrayOfStationStop(ArrayOfStationStop value) {
        return new JAXBElement<ArrayOfStationStop>(_ArrayOfStationStop_QNAME, ArrayOfStationStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Train }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "Train")
    public JAXBElement<Train> createTrain(Train value) {
        return new JAXBElement<Train>(_Train_QNAME, Train.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "ArrayOfStation")
    public JAXBElement<ArrayOfStation> createArrayOfStation(ArrayOfStation value) {
        return new JAXBElement<ArrayOfStation>(_ArrayOfStation_QNAME, ArrayOfStation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "StationStop")
    public JAXBElement<StationStop> createStationStop(StationStop value) {
        return new JAXBElement<StationStop>(_StationStop_QNAME, StationStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainListTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "TrainListTransport")
    public JAXBElement<TrainListTransport> createTrainListTransport(TrainListTransport value) {
        return new JAXBElement<TrainListTransport>(_TrainListTransport_QNAME, TrainListTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "ArrayOfTrain")
    public JAXBElement<ArrayOfTrain> createArrayOfTrain(ArrayOfTrain value) {
        return new JAXBElement<ArrayOfTrain>(_ArrayOfTrain_QNAME, ArrayOfTrain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Station }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "Station")
    public JAXBElement<Station> createStation(Station value) {
        return new JAXBElement<Station>(_Station_QNAME, Station.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "name", scope = Station.class)
    public JAXBElement<String> createStationName(String value) {
        return new JAXBElement<String>(_StationName_QNAME, String.class, Station.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "TrainViewServiceNs", name = "GetStationsResult", scope = GetStationsResponse.class)
    public JAXBElement<ArrayOfStation> createGetStationsResponseGetStationsResult(ArrayOfStation value) {
        return new JAXBElement<ArrayOfStation>(_GetStationsResponseGetStationsResult_QNAME, ArrayOfStation.class, GetStationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "nextStops", scope = Train.class)
    public JAXBElement<ArrayOfStationStop> createTrainNextStops(ArrayOfStationStop value) {
        return new JAXBElement<ArrayOfStationStop>(_TrainNextStops_QNAME, ArrayOfStationStop.class, Train.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrain }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/TrainView.Web", name = "trains", scope = TrainListTransport.class)
    public JAXBElement<ArrayOfTrain> createTrainListTransportTrains(ArrayOfTrain value) {
        return new JAXBElement<ArrayOfTrain>(_TrainListTransportTrains_QNAME, ArrayOfTrain.class, TrainListTransport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainListTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "TrainViewServiceNs", name = "GetTrainsResult", scope = GetTrainsResponse.class)
    public JAXBElement<TrainListTransport> createGetTrainsResponseGetTrainsResult(TrainListTransport value) {
        return new JAXBElement<TrainListTransport>(_GetTrainsResponseGetTrainsResult_QNAME, TrainListTransport.class, GetTrainsResponse.class, value);
    }

}
