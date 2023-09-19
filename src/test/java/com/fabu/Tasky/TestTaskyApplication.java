package com.fabu.Tasky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTaskyApplication {

	public static void main(String[] args) {
		SpringApplication.from(TaskyApplication::main).with(TestTaskyApplication.class).run(args);
	}

}
