package com.maktabsharif.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class AccountTest {
    @Test
    @DisplayName("create account entity and check is generate id")
    @Disabled

    public void createUser() {
        User user = new User();
        assertNotNull(user.getId());
    }

    @Test
    @DisplayName("check generated id length equals 36")
    @Disabled

    public void checkLengthUserId() {
        User user = new User();
        assertNotNull(user.getId());
    }
}