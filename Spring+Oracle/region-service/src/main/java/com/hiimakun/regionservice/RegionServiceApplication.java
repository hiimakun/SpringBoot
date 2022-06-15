package com.hiimakun.regionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RegionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegionServiceApplication.class, args);
	}

}
