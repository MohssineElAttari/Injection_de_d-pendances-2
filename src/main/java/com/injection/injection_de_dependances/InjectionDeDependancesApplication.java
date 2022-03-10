package com.injection.injection_de_dependances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InjectionDeDependancesApplication {
    @Autowired
    private IUserService iUserService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
        SpringApplication.run(InjectionDeDependancesApplication.class, args);
        UserService user =context.getBean(UserService.class);
        String name = user.getFullName();

        System.out.println("####################################");
        System.out.println(name);
        System.out.println("####################################");
    }

}
