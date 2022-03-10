package com.injection.injection_de_dependances;

import org.springframework.stereotype.Component;

@Component
public class UserDAO implements IUserDAO{
    public String[] getUsers(){
        String[] users= {"mohssine","elattari"};
        return users;
    }
}
