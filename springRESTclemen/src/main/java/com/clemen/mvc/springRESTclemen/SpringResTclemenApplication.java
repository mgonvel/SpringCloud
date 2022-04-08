package com.clemen.mvc.springRESTclemen;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

import com.clemen.mvc.springRESTclemen.SpringResTclemenApplication;
import com.clemen.mvc.springRESTclemen.entity.Cliente;
import com.clemen.mvc.springRESTclemen.service.impl.ClienteServiceImpl;
@EnableEurekaClient
@SpringBootApplication
public class SpringResTclemenApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(SpringResTclemenApplication.class, args);
		ClienteServiceImpl service = context.getBean(ClienteServiceImpl.class);

		Cliente cliente = new Cliente("Antonio", "Rodriguez", LocalDate.now(),"12345678M");
		service.crearCliente(cliente);
	}

}
