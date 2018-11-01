package com.playtech;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Transaction {

    private int tranID;
    private Account account;
    private double amount;
    private String type;
    private LocalDateTime timeStamp;
    private double endBalance;

    @Override
    public String toString() {
        return "Transaction{" +
                "tranID=" + tranID +
                ", account=" + account +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", timeStamp=" + timeStamp +
                ", endBalance=" + endBalance +
                '}';
    }

    public Transaction(Account account, int tranID, double amount, String type, LocalDateTime timeStamp, double endBalance) {
        this.account=account;
        this.tranID = tranID;
        this.amount = amount;
        this.type = type;
        this.timeStamp = timeStamp;
        this.endBalance = endBalance;
    }

    public Transaction(Account account, int tranID, double amount, String type, LocalDateTime timeStamp) {
        this.account=account;
        this.tranID = tranID;
        this.amount = amount;
        this.type = type;
        this.timeStamp = timeStamp;
    }

    public Transaction(Object o) {
    }
}
