package com.spring.cloude.redis.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableCaching
public class RedisCacheAppaction {
    public static void main(String[] args) {
        SpringApplication.run(RedisCacheAppaction.class,args);

    }
}
