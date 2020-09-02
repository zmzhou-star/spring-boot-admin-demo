package com.github.zmzhou.adminclient;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

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
}
