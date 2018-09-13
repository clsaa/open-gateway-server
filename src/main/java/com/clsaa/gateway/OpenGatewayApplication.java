package com.clsaa.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * <p>
 * 开放gateway启动类
 * </p>
 *
 * @author 任贵杰 812022339@qq.com
 * @since 2018-09-11
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class OpenGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenGatewayApplication.class, args);
    }
}
