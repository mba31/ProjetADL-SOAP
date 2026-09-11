
package tp2_soap_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tp2_soap_client package. 
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

    private final static QName _ConsulterDisponibilites_QNAME = new QName("http://tp2_soap/", "consulterDisponibilites");
    private final static QName _ConsulterDisponibilitesResponse_QNAME = new QName("http://tp2_soap/", "consulterDisponibilitesResponse");
    private final static QName _EfectuerReservation_QNAME = new QName("http://tp2_soap/", "efectuerReservation");
    private final static QName _EfectuerReservationResponse_QNAME = new QName("http://tp2_soap/", "efectuerReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tp2_soap_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterDisponibilites }
     * 
     */
    public ConsulterDisponibilites createConsulterDisponibilites() {
        return new ConsulterDisponibilites();
    }

    /**
     * Create an instance of {@link EfectuerReservation }
     * 
     */
    public EfectuerReservation createEfectuerReservation() {
        return new EfectuerReservation();
    }

    /**
     * Create an instance of {@link ConsulterDisponibilitesResponse }
     * 
     */
    public ConsulterDisponibilitesResponse createConsulterDisponibilitesResponse() {
        return new ConsulterDisponibilitesResponse();
    }

    /**
     * Create an instance of {@link EfectuerReservationResponse }
     * 
     */
    public EfectuerReservationResponse createEfectuerReservationResponse() {
        return new EfectuerReservationResponse();
    }

    /**
     * Create an instance of {@link Offre }
     * 
     */
    public Offre createOffre() {
        return new Offre();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibilites }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2_soap/", name = "consulterDisponibilites")
    public JAXBElement<ConsulterDisponibilites> createConsulterDisponibilites(ConsulterDisponibilites value) {
        return new JAXBElement<ConsulterDisponibilites>(_ConsulterDisponibilites_QNAME, ConsulterDisponibilites.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterDisponibilitesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2_soap/", name = "consulterDisponibilitesResponse")
    public JAXBElement<ConsulterDisponibilitesResponse> createConsulterDisponibilitesResponse(ConsulterDisponibilitesResponse value) {
        return new JAXBElement<ConsulterDisponibilitesResponse>(_ConsulterDisponibilitesResponse_QNAME, ConsulterDisponibilitesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfectuerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2_soap/", name = "efectuerReservation")
    public JAXBElement<EfectuerReservation> createEfectuerReservation(EfectuerReservation value) {
        return new JAXBElement<EfectuerReservation>(_EfectuerReservation_QNAME, EfectuerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EfectuerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp2_soap/", name = "efectuerReservationResponse")
    public JAXBElement<EfectuerReservationResponse> createEfectuerReservationResponse(EfectuerReservationResponse value) {
        return new JAXBElement<EfectuerReservationResponse>(_EfectuerReservationResponse_QNAME, EfectuerReservationResponse.class, null, value);
    }

}
