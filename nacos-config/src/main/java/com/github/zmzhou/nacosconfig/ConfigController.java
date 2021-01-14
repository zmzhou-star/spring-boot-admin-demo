package com.github.zmzhou.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新 
 * @title ConfigController
 * @author zmzhou
 * @version 1.0
 * @date 2020/9/17 17:29
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    /**
     * 首先通过调用 Nacos Open API 向 Nacos Server 发布配置：dataId 为example.properties，内容为useLocalCache=true
     * curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=nacos-config.properties&group=DEFAULT_GROUP&content=useLocalCache=true"
     * 运行 NacosConfigApplication，调用 curl http://localhost:8080/config/get，返回内容是 true
     * @return useLocalCache
     * @author zmzhou
     * @date 2020/9/17 17:49
     */
    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}