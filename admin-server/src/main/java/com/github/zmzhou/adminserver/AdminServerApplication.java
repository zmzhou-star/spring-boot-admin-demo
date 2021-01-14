package com.github.zmzhou.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;


/**
 * 管理服务器应用程序
 *
 * @author zmzhou
 * @date 2020/09/01
 */
@EnableEurekaClient
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class AdminServerApplication {

	/**
	 * 主要
	 *
	 * @param args arg游戏
	 */
	public static void main(String[] args) {
		SpringApplication.run(AdminServerApplication.class, args);
	}

}
