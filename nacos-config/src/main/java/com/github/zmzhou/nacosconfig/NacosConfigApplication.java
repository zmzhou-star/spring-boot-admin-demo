package com.github.zmzhou.nacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动 Nacos 配置管理服务 
 * @title NacosConfigApplication
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 17:30
 */
@SpringBootApplication
public class NacosConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosConfigApplication.class, args);
	}

}
