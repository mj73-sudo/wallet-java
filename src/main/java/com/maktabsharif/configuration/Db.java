package com.maktabsharif.configuration;

import java.util.ArrayList;
import java.util.List;

import com.maktabsharif.entity.Account;
import com.maktabsharif.entity.Transaction;
import com.maktabsharif.entity.User;

public class Db {
    private static List<User> users = null;
    private static List<Account> accounts = null;
    private static List<Transaction> transactions = null;

    public static List<User> getUsers() {
        if (users == null) {
            synchronized (users) {
                if (users == null) {
                    users = new ArrayList<User>();
                }
            }
        }
        return users;
    }

    public static List<Account> getAccounts() {
        if (accounts == null) {
            synchronized (accounts) {
                if (accounts == null) {
                    accounts = new ArrayList<Account>();
                }
            }
        }
        return accounts;
    }

    public static List<Transaction> getTransactions() {
        if (transactions == null) {
            synchronized (transactions) {
                if (transactions == null) {
                    transactions = new ArrayList<Transaction>();
                }
            }
        }
        return transactions;
    }

}
