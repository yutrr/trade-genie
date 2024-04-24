package com.xie.tradegenie.genie.gateway.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @title: GenieGatewayApplication
 * @Author Xie
 * @Date: 2024/3/26 23:08
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.xie"})
public class GenieGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenieGatewayApplication.class, args);
    }
}

