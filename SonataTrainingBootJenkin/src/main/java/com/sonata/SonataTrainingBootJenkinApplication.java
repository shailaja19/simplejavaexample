package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonataTrainingBootJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonataTrainingBootJenkinApplication.class, args);
		
		AddInterface ad = new AddImple();
		System.out.println(ad.add(10,20));
		
	}

}
