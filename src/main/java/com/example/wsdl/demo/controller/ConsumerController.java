package com.example.wsdl.demo.controller;

import jakarta.xml.ws.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@RestController
@RequestMapping("/soap/consumer")
public class ConsumerController {

//    @GetMapping("/calcularIdade/{data}")
//    public int calcularIdade(@PathVariable String data) throws MalformedURLException {
//        var certidaoNascimento = getPort();
//        return certidaoNascimento.calcularIdade(data);
//    }
//
//    @GetMapping("/diaSemanaNascimento/{data}")
//    public String diaSemanaNascimento(@PathVariable String data) throws MalformedURLException {
//        var certidaoNascimento = getPort();
//        return certidaoNascimento.diaSemanaNascimento(data);
//    }
//
//    private CertidaoNascimento getPort() throws MalformedURLException {
//        URL url = new URL("http://localhost:8085/certidaoNascimento?wsdl");
//        QName qname = new QName("http://service.demo.wsdl.example.com/", "CertidaoNascimentoImplService");
//        Service service = Service.create(url, qname);
//        return service.getPort(CertidaoNascimento.class);
//    }
}
