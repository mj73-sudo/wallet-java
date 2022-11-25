package com.maktabsharif.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.maktabsharif.entity.enums.AccountType;
import com.maktabsharif.util.Utils;

@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "balance")
    private Long balance;
    private ZonedDateTime lastTransaction;
    private AccountType accountType;

    @ManyToOne(fetch = FetchType.LAZY)
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
