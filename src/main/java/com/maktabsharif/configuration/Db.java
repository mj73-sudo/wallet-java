package com.maktabsharif.configuration;

import java.util.ArrayList;
import java.util.List;

import com.maktabsharif.entity.Account;
import com.maktabsharif.entity.Transaction;
import com.maktabsharif.entity.User;
import com.maktabsharif.repository.Repository;

public class Db {

    private static Repository<User> userRepository = null;
    private static Repository<Account> accountRepository = null;
    private static Repository<Transaction> transactionRepository = null;

    public static Repository<User> getUserRepository() {
        if (userRepository == null) {
            synchronized (userRepository) {
                if (userRepository == null) {
                    userRepository = new Repository<>();
                }
            }
        }
        return userRepository;
    }

    public static Repository<Account> getAccountRepository() {
        if (accountRepository == null) {
            synchronized (accountRepository) {
                if (accountRepository == null) {
                    accountRepository = new Repository<>();
                }
            }
        }
        return accountRepository;
    }

    public static Repository<Transaction> getTransactionRepository() {
        if (transactionRepository == null) {
            synchronized (transactionRepository) {
                if (transactionRepository == null) {
                    transactionRepository = new Repository<>();
                }
            }
        }
        return transactionRepository;
    }
}
