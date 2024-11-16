package com.example.wsdl.demo;

import com.example.wsdl.demo.correios_consumer.AtendeCliente;
import com.example.wsdl.demo.correios_consumer.EnderecoERP;
import com.example.wsdl.demo.service.CertidaoNascimentoImpl;
import jakarta.xml.ws.Endpoint;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner publishEndpoints() {
		return args -> {
//			CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl();
//			Endpoint.publish("http://localhost:8085/certidaoNascimento", certidaoNascimento);
//			System.out.println("Serviço publicado com sucesso");
		};
	}

	@Bean
	CommandLineRunner listenEndpoints() throws MalformedURLException {
		return args -> {
//			URL url = new URL("http://localhost:8085/certidaoNascimento?wsdl");
//
//			QName qname = new QName("http://service.demo.wsdl.example.com/", "CertidaoNascimentoImplService");
//
//			Service service = Service.create(url, qname);
//
//			CertidaoNascimento certidao = service.getPort(CertidaoNascimento.class);
//			int idade = certidao.calcularIdade("18-04-2002");
//			String diaSemana = certidao.diaSemanaNascimento("18-04-2002");
//			System.out.println("Idade: " + idade);
//			System.out.println("Dia da semana: " + diaSemana);
		};
	}

	@Bean
	CommandLineRunner correioConsumer() throws MalformedURLException {
		return args -> {
			URL urlCooreios = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");

			QName qnameCorreios = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");

			Service serviceCorreios = Service.create(urlCooreios, qnameCorreios);

			AtendeCliente correios = serviceCorreios.getPort(AtendeCliente.class);

			EnderecoERP endereco = correios.consultaCEP("87023150", "", "");
			System.out.println(endereco.getCidade());
			System.out.println(endereco.getBairro());

		};
	}

}
