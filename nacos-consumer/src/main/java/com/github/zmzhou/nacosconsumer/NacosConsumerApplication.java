package com.github.zmzhou.nacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 微服务消费者 
 * @title NacosConsumerApplication
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 14:31
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerApplication.class, args);
	}

}
