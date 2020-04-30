package com.pincode.pincodeapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pincode")
public class PinCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinCodeApplication.class, args);
	}

}
