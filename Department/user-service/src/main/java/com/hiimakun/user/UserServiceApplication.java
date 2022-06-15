package com.hiimakun.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

//	@Bean
////	Cân bằng tải (Load balancing) là gì?
////	Nếu như có nhiều hơn một instance của một service chạy trên các port khác nhau
////	thì chúng ta cần cân bằng những request giữa tất cả các instance đó.
////	Trong điều kiện lý tưởng thì cân bằng tải sẽ giúp các port nhận số lượng request tương đương nhau.
//	@LoadBalanced
////	RestTemplate: là một object cho phép gửi request đến một REST API service.
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
}
