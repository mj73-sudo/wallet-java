package com.maktabsharif.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.maktabsharif.entity.User;
import com.maktabsharif.exception.UserExistException;

public class UserServiceTest {
    private static UserService userService;
    private static User user;

    @BeforeAll
    public static void init() {
        userService = new UserService();
        user = new User();
        // user.setUsername("admin");
    }

    @Test
    @Disabled
    public void isCreateUser() {
        userService.create(user);
        assertEquals(userService.count(), 1);
    }

    @Test
    @RepeatedTest(2)
    @Disabled
    public void createExistUser() {
        assertThrows(UserExistException.class,
                () -> {
                    userService.create(user);
                });
    }

}
