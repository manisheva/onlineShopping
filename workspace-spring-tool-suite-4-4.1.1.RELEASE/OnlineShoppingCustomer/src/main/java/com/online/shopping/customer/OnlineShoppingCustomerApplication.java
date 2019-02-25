package com.online.shopping.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"com.online.**"})
//@SpringBootApplication(scanBasePackages= {"com.online.shopping.*"})
//@EnableJpaRepositories
//@EnableJpaRepositories("com.online.shopping.customerDao")

@EnableJpaRepositories("com.online.shopping.*")
@ComponentScan(basePackages = { "com.online.shopping.*" })
@EntityScan("com.online.shopping.*") 
@SpringBootApplication
public class OnlineShoppingCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingCustomerApplication.class, args);
	}

}