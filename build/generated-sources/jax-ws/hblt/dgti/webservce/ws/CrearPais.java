
package hblt.dgti.webservce.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearPais complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearPais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearPais", propOrder = {
    "nomPais"
})
public class CrearPais {

    protected String nomPais;

    /**
     * Obtiene el valor de la propiedad nomPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPais() {
        return nomPais;
    }

    /**
     * Define el valor de la propiedad nomPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPais(String value) {
        this.nomPais = value;
    }

}
