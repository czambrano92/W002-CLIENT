
package hblt.dgti.webservce.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hblt.dgti.webservce.ws package. 
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

    private final static QName _ListarPaisResponse_QNAME = new QName("http://ws.webservice.dgti.hblt/", "listarPaisResponse");
    private final static QName _CrearPais_QNAME = new QName("http://ws.webservice.dgti.hblt/", "crearPais");
    private final static QName _ListarPais_QNAME = new QName("http://ws.webservice.dgti.hblt/", "listarPais");
    private final static QName _CrearPaisResponse_QNAME = new QName("http://ws.webservice.dgti.hblt/", "crearPaisResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hblt.dgti.webservce.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearPaisResponse }
     * 
     */
    public CrearPaisResponse createCrearPaisResponse() {
        return new CrearPaisResponse();
    }

    /**
     * Create an instance of {@link ListarPais }
     * 
     */
    public ListarPais createListarPais() {
        return new ListarPais();
    }

    /**
     * Create an instance of {@link CrearPais }
     * 
     */
    public CrearPais createCrearPais() {
        return new CrearPais();
    }

    /**
     * Create an instance of {@link ListarPaisResponse }
     * 
     */
    public ListarPaisResponse createListarPaisResponse() {
        return new ListarPaisResponse();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.dgti.hblt/", name = "listarPaisResponse")
    public JAXBElement<ListarPaisResponse> createListarPaisResponse(ListarPaisResponse value) {
        return new JAXBElement<ListarPaisResponse>(_ListarPaisResponse_QNAME, ListarPaisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.dgti.hblt/", name = "crearPais")
    public JAXBElement<CrearPais> createCrearPais(CrearPais value) {
        return new JAXBElement<CrearPais>(_CrearPais_QNAME, CrearPais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.dgti.hblt/", name = "listarPais")
    public JAXBElement<ListarPais> createListarPais(ListarPais value) {
        return new JAXBElement<ListarPais>(_ListarPais_QNAME, ListarPais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPaisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.webservice.dgti.hblt/", name = "crearPaisResponse")
    public JAXBElement<CrearPaisResponse> createCrearPaisResponse(CrearPaisResponse value) {
        return new JAXBElement<CrearPaisResponse>(_CrearPaisResponse_QNAME, CrearPaisResponse.class, null, value);
    }

}
