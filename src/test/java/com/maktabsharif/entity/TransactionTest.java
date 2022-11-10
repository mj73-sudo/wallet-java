package com.maktabsharif.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TransactionTest {

    @Test
    public void createTransaction() {
        Transaction transaction = new Transaction();
        assertNotNull(transaction.getId());
    }

    @Test
    public void checkLengthTransactionId() {
        Transaction transaction = new Transaction();
        assertEquals(transaction.getId().length(), 36);
    }
}
