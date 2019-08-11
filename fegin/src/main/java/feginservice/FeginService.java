package feginservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="service1",fallback = Feignfallback.class)
public interface FeginService {

    @RequestMapping("/service1ceshi")
    public String ceshi2();
}
