package feginservice;

import feginservice.FeginService;
import org.springframework.stereotype.Component;

@Component
public class Feignfallback implements FeginService {
    @Override
    public String ceshi2() {
        return "服务异常";
    }
}
