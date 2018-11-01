package com.playtech;

import java.util.List;

public class Account {

    private String firstname;
    private String lastname;
    private double balance;

    @Override
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                // ", balance=" + balance +
                '}';
    }

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        balance = balance + amount;
    }
}
