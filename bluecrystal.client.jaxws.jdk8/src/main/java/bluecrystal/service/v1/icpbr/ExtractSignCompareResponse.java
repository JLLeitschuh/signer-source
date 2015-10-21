
package bluecrystal.service.v1.icpbr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de extractSignCompareResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="extractSignCompareResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://icpbr.v1.service.bluecrystal/}signCompare" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extractSignCompareResponse", propOrder = {
    "_return"
})
public class ExtractSignCompareResponse {

    @XmlElement(name = "return")
    protected SignCompare _return;

    /**
     * Obt�m o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link SignCompare }
     *     
     */
    public SignCompare getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link SignCompare }
     *     
     */
    public void setReturn(SignCompare value) {
        this._return = value;
    }

}
