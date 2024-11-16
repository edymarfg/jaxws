
package com.example.wsdl.demo.correios_consumer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarParametrosPorDescricaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="pesquisarParametrosPorDescricaoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}dimensaoTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarParametrosPorDescricaoResponse", propOrder = {
    "_return"
})
public class PesquisarParametrosPorDescricaoResponse {

    @XmlElement(name = "return")
    protected DimensaoTO _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link DimensaoTO }
     *     
     */
    public DimensaoTO getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensaoTO }
     *     
     */
    public void setReturn(DimensaoTO value) {
        this._return = value;
    }

}