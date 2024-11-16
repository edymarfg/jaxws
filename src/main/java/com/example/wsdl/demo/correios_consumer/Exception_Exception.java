
package com.example.wsdl.demo.correios_consumer;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.example.wsdl.demo.correios_consumer.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, com.example.wsdl.demo.correios_consumer.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, com.example.wsdl.demo.correios_consumer.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.example.wsdl.demo.correios_consumer.Exception
     */
    public com.example.wsdl.demo.correios_consumer.Exception getFaultInfo() {
        return faultInfo;
    }

}