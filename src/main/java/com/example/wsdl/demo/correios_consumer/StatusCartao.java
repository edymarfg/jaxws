
package com.example.wsdl.demo.correios_consumer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>{@code
 * <simpleType name="statusCartao">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Desconhecido"/>
 *     <enumeration value="Normal"/>
 *     <enumeration value="Suspenso"/>
 *     <enumeration value="Cancelado"/>
 *     <enumeration value="Irregular"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "statusCartao")
@XmlEnum
public enum StatusCartao {

    @XmlEnumValue("Desconhecido")
    DESCONHECIDO("Desconhecido"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Suspenso")
    SUSPENSO("Suspenso"),
    @XmlEnumValue("Cancelado")
    CANCELADO("Cancelado"),
    @XmlEnumValue("Irregular")
    IRREGULAR("Irregular");
    private final String value;

    StatusCartao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCartao fromValue(String v) {
        for (StatusCartao c: StatusCartao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
