package com.maktabsharif.entity;

import java.time.ZonedDateTime;

import com.maktabsharif.entity.enums.AccountType;
import com.maktabsharif.util.Utils;

public class Account extends BaseEntity {
    private String id;
    private Long balance;
    private ZonedDateTime lastTransaction;
    private AccountType accountType;
    private User user;

    public Account() {
        id = Utils.generateId();
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public ZonedDateTime getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(ZonedDateTime lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

}
