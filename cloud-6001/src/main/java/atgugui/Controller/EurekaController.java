package atgugui.Controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EurekaController {

    @Resource
    private DiscoveryClient discoveryClient;



}
