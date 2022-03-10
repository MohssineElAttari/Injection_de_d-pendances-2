package com.injection.injection_de_dependances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService implements IUserService{
    @Autowired
    private UserDAO userDAO ;
    public String getFullName(){
        String[] userInfo = userDAO.getUsers();
        return userInfo[0]+" - "+userInfo[1];
    }


}
