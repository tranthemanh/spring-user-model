package com.codegym.DAO;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("manh", "123456", "Manh", "manh@codegym.vn", 24));
        users.add(new User("nguyen", "123456", "Nguyen", "nguyen@codegym.vn", 24));
        users.add(new User("trang", "123456", "Trang", "trang@codegym.vn", 23));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}