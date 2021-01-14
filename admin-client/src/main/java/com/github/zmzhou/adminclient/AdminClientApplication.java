package com.github.zmzhou.adminclient;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

import lombok.extern.slf4j.Slf4j;

/**
 * 管理客户端应用程序
 *
 * @author zmzhou
 * @date 2020/09/01
 */
@Slf4j
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class AdminClientApplication {

	/**
	 * 主要
	 *
	 * @param args arg游戏
	 */
	public static void main(String[] args) {
		SpringApplication.run(AdminClientApplication.class, args);
	}
	/**
	 * @description 定时任务
	 * @author zmzhou
	 * @date 2020/8/30 12:52
	 */
	@Scheduled(cron = "0/20 * * * * ?")
	public void run20s() {
		log.info("定时任务:{}", LocalDateTime.now());
	}
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
