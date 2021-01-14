package com.github.zmzhou.nacosconsumer;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
 * @title TestController
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 14:32
 */
@Slf4j
@RestController
public class TestController {

	@Resource
	private LoadBalancerClient loadBalancerClient;

	/**
	 * 测试 
	 * @return string
	 * @author zmzhou
	 * @date 2020/9/17 14:32
	 */
	@GetMapping("/test")
	public String test() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
		String url = serviceInstance.getUri() + "/echo/zhangSan";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		return "Invoke : " + url + ", return : " + result;
	}

	@GetMapping(value = "/echo/{str}")
	public String echo(@PathVariable String str) {
		ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
		String url = serviceInstance.getUri() + "/echo/" + str;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, String.class);
	}
}
