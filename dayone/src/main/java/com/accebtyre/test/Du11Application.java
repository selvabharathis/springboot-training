package com.accebtyre.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Du11Application implements CommandLineRunner {

	@Autowired
	private Engine engine;

	@Autowired
	private Car car;

	public static void main(String[] args) {
		SpringApplication.run(Du11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.engine.setEngine("D100");
		System.out.println(this.engine.getEngine());
		this.car.modifyCar("swift");
		System.out.println(this.engine.getEngine());
	}

}
