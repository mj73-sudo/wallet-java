package com.maktabsharif.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.maktabsharif.entity.enums.TransactionChannel;
import com.maktabsharif.entity.enums.TransactionType;
import com.maktabsharif.util.Utils;

public class Transaction extends BaseEntity {
    private String id;
    private Long value;
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private TransactionChannel transactionChannel;
    private Account account;

    public Transaction() {
        id = Utils.generateId();
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionChannel getTransactionChannel() {
        return transactionChannel;
    }

    public void setTransactionChannel(TransactionChannel transactionChannel) {
        this.transactionChannel = transactionChannel;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getId() {
        return id;
    }

}
