package com.online.shopping.serverConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OnlineShoppingConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingConfigApplication.class, args);
	}

}
