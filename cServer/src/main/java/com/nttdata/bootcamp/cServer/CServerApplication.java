package com.nttdata.bootcamp.cServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CServerApplication.class, args);
	}

}
