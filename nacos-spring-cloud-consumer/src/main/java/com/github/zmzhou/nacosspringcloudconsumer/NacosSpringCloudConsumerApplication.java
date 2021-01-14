package com.github.zmzhou.nacosspringcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 微服务消费者 
 * @title NacosSpringCloudConsumerApplication
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 14:31
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosSpringCloudConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NacosSpringCloudConsumerApplication.class, args);
	}

}
