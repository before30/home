package cc.before30.homae.backenddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendReactiveDemoApplication {

    @GetMapping("/hello")
    public String hello() {
        return "world from backednReactiveDemo";
    }

    public static void main(String[] args) {
        SpringApplication.run(BackendReactiveDemoApplication.class, args);
    }
}
