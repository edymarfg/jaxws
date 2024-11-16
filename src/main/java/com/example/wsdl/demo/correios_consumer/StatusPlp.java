
package com.example.wsdl.demo.correios_consumer;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusPlp.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>{@code
 * <simpleType name="statusPlp">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Aberta"/>
 *     <enumeration value="Fechada"/>
 *     <enumeration value="Postada"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "statusPlp")
@XmlEnum
public enum StatusPlp {

    @XmlEnumValue("Aberta")
    ABERTA("Aberta"),
    @XmlEnumValue("Fechada")
    FECHADA("Fechada"),
    @XmlEnumValue("Postada")
    POSTADA("Postada");
    private final String value;

    StatusPlp(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusPlp fromValue(String v) {
        for (StatusPlp c: StatusPlp.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
