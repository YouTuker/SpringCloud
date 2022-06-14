package atgugui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloud6001 {
    public static void main(String[] args) {

                SpringApplication.run(Cloud6001.class,args);

            }
}
