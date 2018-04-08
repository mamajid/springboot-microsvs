package com.amajid.learning.sboot.springbootmicrosvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMicrosvsApplication {

	public static void main(String[] args) {
		System.out.println("Hello World\n");
		System.out.println("this should update the github repo and fire-up Jenkins...");
		System.out.println("Otherwise keep trying....");
		SpringApplication.run(SpringbootMicrosvsApplication.class, args);

	}


}
