package com.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDsaApplication.class, args);
		System.out.println(Thread.currentThread());
	}

}
