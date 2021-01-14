package com.github.zmzhou.adminclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.nacos.api.config.annotation.NacosValue;
/**
 * 通过 Nacos 的 @NacosValue 注解设置属性值 
 * @title ConfigController
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 11:22
 */
@Controller
@RequestMapping("config")
public class ConfigController {

	@NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
	private boolean useLocalCache;

	@GetMapping(value = "/get")
	@ResponseBody
	public boolean get() {
		return useLocalCache;
	}
}