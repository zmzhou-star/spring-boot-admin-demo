package com.github.zmzhou.nacosspringcloudprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * microservice-provider-user
 * 用户模块微服务
 * @title MicroserviceProviderUserApplication
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 11:42
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProviderUserApplication {

	/**
	 * 启动 
	 * @author zmzhou
	 * @date 2020/9/17 11:42
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserApplication.class, args);
	}

}
