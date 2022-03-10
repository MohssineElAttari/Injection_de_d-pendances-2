package com.injection.injection_de_dependances;

public class UserDAO implements IUserDAO{
    public String[] getUsers(){
        String[] users= {"mohssine","elattari"};
        return users;
    }
}
