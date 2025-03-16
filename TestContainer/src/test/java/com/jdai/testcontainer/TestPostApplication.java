package com.jdai.testcontainer;

import org.springframework.boot.SpringApplication;

public class TestPostApplication {

	public static void main(String[] args) {
		SpringApplication.from(PostApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
