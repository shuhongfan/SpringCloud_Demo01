package com.shf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker  //对hystrixR熔断机制的支持
@EnableDiscoveryClient  // 服务发现
@EnableEurekaClient  // 本服务启动后会自动注入进eureka服务中
@SpringBootApplication // 本服务启动后会自动
public class DeptProvider8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class,args);
    }
}
