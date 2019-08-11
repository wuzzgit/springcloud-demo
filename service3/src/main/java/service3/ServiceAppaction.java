package service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceAppaction {
    public static void main(String[] args){
        SpringApplication.run(ServiceAppaction.class,args);
    }

}
