package service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class ServiceAppaction2 {
    public static void main(String[] args){
        SpringApplication.run(ServiceAppaction2.class,args);
    }

 /*   @Bean
    @LoadBalanced//支持负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }*/


}
