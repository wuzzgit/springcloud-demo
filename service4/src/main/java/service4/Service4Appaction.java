package service4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Service4Appaction {
    public static void main(String[] args){
        SpringApplication.run(Service4Appaction.class,args);
    }

}
