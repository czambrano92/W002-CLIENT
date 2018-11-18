
package hblt.dgti.webservce.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PaisWebService", targetNamespace = "http://ws.webservice.dgti.hblt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PaisWebService {


    /**
     * 
     * @param nomPais
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearPais", targetNamespace = "http://ws.webservice.dgti.hblt/", className = "hblt.dgti.webservce.ws.CrearPais")
    @ResponseWrapper(localName = "crearPaisResponse", targetNamespace = "http://ws.webservice.dgti.hblt/", className = "hblt.dgti.webservce.ws.CrearPaisResponse")
    @Action(input = "http://ws.webservice.dgti.hblt/PaisWebService/crearPaisRequest", output = "http://ws.webservice.dgti.hblt/PaisWebService/crearPaisResponse")
    public String crearPais(
        @WebParam(name = "nomPais", targetNamespace = "")
        String nomPais);

    /**
     * 
     * @return
     *     returns java.util.List<hblt.dgti.webservce.ws.Pais>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPais", targetNamespace = "http://ws.webservice.dgti.hblt/", className = "hblt.dgti.webservce.ws.ListarPais")
    @ResponseWrapper(localName = "listarPaisResponse", targetNamespace = "http://ws.webservice.dgti.hblt/", className = "hblt.dgti.webservce.ws.ListarPaisResponse")
    @Action(input = "http://ws.webservice.dgti.hblt/PaisWebService/listarPaisRequest", output = "http://ws.webservice.dgti.hblt/PaisWebService/listarPaisResponse")
    public List<Pais> listarPais();

}
