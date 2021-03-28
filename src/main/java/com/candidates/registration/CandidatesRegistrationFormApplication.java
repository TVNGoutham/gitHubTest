package com.candidates.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CandidatesRegistrationFormApplication {

	public static void main(String[] args) {
		
	ApplicationContext springcontainer=
								SpringApplication.run(CandidatesRegistrationFormApplication.class, args);
	}

}
