
package com.example.wsdl.demo.correios_consumer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de simNao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>{@code
 * <simpleType name="simNao">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="S"/>
 *     <enumeration value="N"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "simNao")
@XmlEnum
public enum SimNao {

    S,
    N;

    public String value() {
        return name();
    }

    public static SimNao fromValue(String v) {
        return valueOf(v);
    }

}
