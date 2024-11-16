
package com.example.wsdl.demo.correios_consumer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de coleta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>{@code
 * <complexType name="coleta">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cklist" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="documento" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="produto" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}produto" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="remetente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}remetente" minOccurs="0"/>
 *         <element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="valor_declarado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coleta", propOrder = {
    "cklist",
    "descricao",
    "documento",
    "idCliente",
    "produto",
    "remetente",
    "tipo",
    "valorDeclarado"
})
@XmlSeeAlso({
    ColetaSimultanea.class,
    ColetaReversa.class
})
public class Coleta {

    protected String cklist;
    protected String descricao;
    @XmlElement(nillable = true)
    protected List<String> documento;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    @XmlElement(nillable = true)
    protected List<Produto> produto;
    protected Remetente remetente;
    protected String tipo;
    @XmlElement(name = "valor_declarado")
    protected String valorDeclarado;

    /**
     * Obtém o valor da propriedade cklist.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCklist() {
        return cklist;
    }

    /**
     * Define o valor da propriedade cklist.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCklist(String value) {
        this.cklist = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the documento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the documento property.
     */
    public List<String> getDocumento() {
        if (documento == null) {
            documento = new ArrayList<>();
        }
        return this.documento;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the produto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the produto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Produto }
     * 
     * 
     * @return
     *     The value of the produto property.
     */
    public List<Produto> getProduto() {
        if (produto == null) {
            produto = new ArrayList<>();
        }
        return this.produto;
    }

    /**
     * Obtém o valor da propriedade remetente.
     * 
     * @return
     *     possible object is
     *     {@link Remetente }
     *     
     */
    public Remetente getRemetente() {
        return remetente;
    }

    /**
     * Define o valor da propriedade remetente.
     * 
     * @param value
     *     allowed object is
     *     {@link Remetente }
     *     
     */
    public void setRemetente(Remetente value) {
        this.remetente = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade valorDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDeclarado() {
        return valorDeclarado;
    }

    /**
     * Define o valor da propriedade valorDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDeclarado(String value) {
        this.valorDeclarado = value;
    }

}