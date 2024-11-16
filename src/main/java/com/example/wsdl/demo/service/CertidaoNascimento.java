package com.example.wsdl.demo.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

//Service Endpoint Interface (SEI)
@WebService //Interface de serviços
@SOAPBinding(style = SOAPBinding.Style.RPC) //Trabalhar com tipos primitivos na entrada e na saída
public interface CertidaoNascimento {
    @WebMethod //Operações de serviço
    public int calcularIdade(String idade);

    @WebMethod
    public String diaSemanaNascimento(String idade);
}
