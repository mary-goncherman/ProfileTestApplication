package com.example.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProfileTestApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ProfileTestApplication.class, args);

        ProfileTestService service = applicationContext.getBean("profileTestService", ProfileTestService.class);
        service.createTestData();
    }

}
