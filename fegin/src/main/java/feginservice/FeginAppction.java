package feginservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class FeginAppction {
    public static void main(String[] args){
        SpringApplication.run(FeginAppction.class,args);
    }
}
