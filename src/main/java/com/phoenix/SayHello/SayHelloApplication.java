package com.phoenix.SayHello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SayHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayHelloApplication.class, args);
		System.out.println("Hello Sonal! welocme to spring boot");

	}

}
