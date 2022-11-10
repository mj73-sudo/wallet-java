package com.maktabsharif.entity;

import com.maktabsharif.entity.enums.TransactionChannel;
import com.maktabsharif.entity.enums.TransactionType;

public class Transaction extends BaseEntity {
    private Long value;
    private TransactionType transactionType;
    private TransactionChannel transactionChannel;
    private Account account;

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

}
