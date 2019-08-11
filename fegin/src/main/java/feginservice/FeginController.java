package feginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {

    @Autowired
    private FeginService service;

    @RequestMapping("/feginsevice")
    public String fegin(){
        return service.ceshi2();
    }

}
