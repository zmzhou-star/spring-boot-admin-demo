package com.github.zmzhou.nacosprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户模块微服务提供者
 * microservice-provider-user
 * @title MicroserviceProviderUserApplication
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 11:42
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProviderApplication.class, args);
	}

}
