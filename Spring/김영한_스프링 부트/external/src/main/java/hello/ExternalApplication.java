package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ExternalApplication {

    public static void main(String[] args) {
        System.out.println("args = " + args);
        SpringApplication.run(ExternalApplication.class, args);
    }
}
