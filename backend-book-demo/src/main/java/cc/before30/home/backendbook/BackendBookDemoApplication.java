package cc.before30.home.backendbook;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Log4j2
@EnableDiscoveryClient
public class BackendBookDemoApplication {
    @GetMapping("/hello")
    public String hello() {
        return "world";
    }

    @RequestMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }

    @RequestMapping(value = "/checked-out")
    public String checkedOut() {
        return "checked out";
    }


    public static void main(String[] args) {
        SpringApplication.run(BackendBookDemoApplication.class, args);
    }
}
