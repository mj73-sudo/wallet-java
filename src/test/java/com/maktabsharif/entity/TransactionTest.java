package com.maktabsharif.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TransactionTest {

    private static Transaction transaction = null;

    @BeforeAll
    public static void init() {
        transaction = new Transaction();
    }

    @Test
    @Disabled

    public void createTransaction() {
        assertNotNull(transaction.getId());
    }

    // @Test
    public void checkLengthTransactionId() {
        // assertEquals(transaction.getId().length(), 36);
    }

    @AfterAll
    public static void finish() {

    }
}
