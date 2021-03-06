package com.example.petcilinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(value = PetClinicProperties.class)  //uygulamaya tanımı yapılır.
public class PetcilinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetcilinicApplication.class, args);
	}

}
