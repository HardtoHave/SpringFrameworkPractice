package org.example.spring.implement;

import org.example.spring.dao.UserDAO;

public class UserDAOImplement implements UserDAO {
    @Override
    public void saveUser() {
        System.out.println("save success");
    }
}
