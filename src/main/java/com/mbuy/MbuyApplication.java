package com.mbuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mbuy.mapper")
public class MbuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbuyApplication.class, args);
	}
}
