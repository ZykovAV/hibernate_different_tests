package com.example.hibernate_different_tests;

import com.example.hibernate_different_tests.services.CreateDBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateDifferentTestsApplication {

	@Autowired
	private CreateDBs createDBs;

	public static void main(String[] args) {
		SpringApplication.run(HibernateDifferentTestsApplication.class, args);
	}

	public void runService() {
		createDBs.createMyDbs();
	}

}
