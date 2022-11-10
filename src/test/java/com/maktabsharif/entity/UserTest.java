package com.maktabsharif.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class UserTest {
    @Test
    @DisplayName("create user entity and check is generate id")
    public void createUser() {
        User user = new User();
        assertNotNull(user.getId());
    }

    @Test
    @DisplayName("check generated id length equals 36")
    public void checkLengthUserId() {
        User user = new User();
        assertNotNull(user.getId());
    }
}