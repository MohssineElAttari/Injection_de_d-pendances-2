package com.injection.injection_de_dependances;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectionDeDependancesApplication {

    public static void main(String[] args) {
        SpringApplication.run(InjectionDeDependancesApplication.class, args);
        UserService userService = new UserService();
        userService.setUserDAO(new UserDAO());
        String name = userService.getFullName();

        System.out.println("####################################");
        System.out.println(name);
        System.out.println("####################################");
    }

}
