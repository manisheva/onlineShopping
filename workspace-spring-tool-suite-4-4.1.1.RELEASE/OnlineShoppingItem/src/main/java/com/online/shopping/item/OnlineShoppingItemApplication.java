package com.online.shopping.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.online.shopping.*")
@ComponentScan(basePackages = { "com.online.shopping.*" })
@EntityScan("com.online.shopping.*") 
@SpringBootApplication
public class OnlineShoppingItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingItemApplication.class, args);
	}

}

