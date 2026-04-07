package com.temple.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.temple.api.temple")
public class TempleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempleApiApplication.class, args);
	}

}
