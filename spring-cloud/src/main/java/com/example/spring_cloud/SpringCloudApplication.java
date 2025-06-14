package com.example.spring_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // habilita como Eureka Client
@EnableFeignClients(basePackages = "com.example.spring_cloud.client") // habilita Feign
public class SpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}
