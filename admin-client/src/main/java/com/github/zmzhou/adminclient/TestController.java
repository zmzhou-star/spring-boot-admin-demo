package com.github.zmzhou.adminclient;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * 测试 
 * @title TestController
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 13:50
 */
@RestController
public class TestController {

	@Resource
	private RestTemplate restTemplate;

	@RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
	public String echo(@PathVariable String str) {
		return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
	}
}