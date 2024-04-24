package com.xie.tradegenie.genie.user.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: GenieUserApplication
 * @Author Xie
 * @Date: 2024/3/26 23:19
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.xie"})
@RestController
public class GenieUserApplication {

    public static void main(String[] args) {

        SpringApplication.run(GenieUserApplication.class, args);
    }

    /**
     * 提供访问测试接口， 支持POST和GET
     **/
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome bulls stock platform! !";
    }
}
