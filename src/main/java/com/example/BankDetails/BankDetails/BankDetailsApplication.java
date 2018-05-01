package com.example.BankDetails.BankDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.BankDetails.BankDetails.models.Branches;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {
		"com.example.BankDetails.BankDetails.repo"
})
@EntityScan(basePackages = {
		"com.example.BankDetails.BankDetails.models"
})
@ComponentScan("com.example.BankDetails.BankDetails.controllers")
public class BankDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankDetailsApplication.class, args);
	}
	
}
