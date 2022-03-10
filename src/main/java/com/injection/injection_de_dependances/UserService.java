package com.injection.injection_de_dependances;

public class UserService {
    private UserDAO userDAO ;
    public String getFullName(){
        String[] userInfo = userDAO.getUsers();
        return userInfo[0]+" - "+userInfo[1];
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO(){
        return this.userDAO;
    }

}
