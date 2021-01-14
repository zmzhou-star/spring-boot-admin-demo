package com.github.zmzhou.nacosprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * EchoController
 *
 * @author zmzhou
 * @version 1.0
 * @title EchoController
 * @date 2020/9/17 11:57
 */
@Slf4j
@RestController
public class EchoController {
	/**
	 * 回复 
	 * @param name name
	 * @return string
	 * @author zmzhou
	 * @date 2020/9/17 11:58
	 */
	@GetMapping(value = "/echo/{name}")
	public String echo(@PathVariable String name) {
		log.info("name:{}", name);
		return "Hello Nacos Discovery " + name;
	}
}