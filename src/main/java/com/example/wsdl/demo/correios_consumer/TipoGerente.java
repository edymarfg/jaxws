
package com.example.wsdl.demo.correios_consumer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoGerente.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>{@code
 * <simpleType name="tipoGerente">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GerenteConta"/>
 *     <enumeration value="GerenteContaMaster"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "tipoGerente")
@XmlEnum
public enum TipoGerente {

    @XmlEnumValue("GerenteConta")
    GERENTE_CONTA("GerenteConta"),
    @XmlEnumValue("GerenteContaMaster")
    GERENTE_CONTA_MASTER("GerenteContaMaster");
    private final String value;

    TipoGerente(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoGerente fromValue(String v) {
        for (TipoGerente c: TipoGerente.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
