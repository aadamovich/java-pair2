package com.playtech;

import java.time.LocalDateTime;

public class Transaction {

    private int tranID;
    private Account debitAccount;
    private Account creditAccount;
    private double amount;
    private String type;
    private LocalDateTime timeStamp;
    private double endDebitBalance;
    private double endCreditBalance;

    @Override
    public String toString() {
        return "Transaction{" +
                "tranID=" + tranID +
                ", debitAccount=" + debitAccount +
                ", creditAccount=" + creditAccount +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", timeStamp=" + timeStamp +
                ", endBalance=" + endDebitBalance +
                ", endBalance=" + endCreditBalance +
                '}';
    }

    public Transaction(Account debitAccount, Account creditAccount, int tranID, double amount, String type, LocalDateTime timeStamp, double endDebitBalance, double endCreditBalance) {
        this.debitAccount = debitAccount;
        this.creditAccount = creditAccount;
        this.tranID = tranID;
        this.amount = amount;
        this.type = type;
        this.timeStamp = timeStamp;
        this.endDebitBalance = endDebitBalance;
        this.endCreditBalance = endCreditBalance;
    }

    public Transaction(Account debitAccount, Account creditAccount, int tranID, double amount, String type, LocalDateTime timeStamp) {
        this.debitAccount = debitAccount;
        this.creditAccount = creditAccount;
        this.tranID = tranID;
        this.amount = amount;
        this.type = type;
        this.timeStamp = timeStamp;
    }

}
