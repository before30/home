package cc.before30.home.backendreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendDemoApplication {

    @GetMapping
    public String hello() {
        return "world from backenddemo";
    }
    public static void main(String[] args) {
        SpringApplication.run(BackendDemoApplication.class, args);
    }

}
