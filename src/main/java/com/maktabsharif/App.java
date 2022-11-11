package com.maktabsharif;

import org.hibernate.Session;

import com.maktabsharif.configuration.DatabaseConfiguration;
import com.maktabsharif.entity.User;
import com.maktabsharif.service.UserService;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        UserService service = new UserService();

        User user = new User();
        user.setUsername("admin");

        service.create(user);

    }
}
