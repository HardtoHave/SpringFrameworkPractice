package org.example.spring.implement;

import org.example.spring.dao.UserDAO;
import org.example.spring.service.UserService;

public class UserServiceImplement implements UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void saveUser() {
        userDAO.saveUser();
    }
}
