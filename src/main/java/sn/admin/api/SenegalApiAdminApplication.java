package sn.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "sn.admin.api")
public class SenegalApiAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SenegalApiAdminApplication.class, args);
        System.out.println(" Swagger documentation available at: http://localhost:8081/swagger-ui/index.html");
    }
}
