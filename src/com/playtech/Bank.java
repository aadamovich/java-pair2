package com.playtech;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Bank {

    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("Peeter", "Jalakas", 1000),
                new Account("Reet", "Kask", 100),
                new Account("Villu", "Vaher", 2000),
                new Account("Janar", "Saar", 1000),
                new Account("Ülo", "Tamm", 1000)
        );

        List<Transaction> transactions = Arrays.asList(
                new Transaction(accounts.get(0), accounts.get(3), 1000, 100, "deposit", LocalDateTime.now()),
                new Transaction(accounts.get(0), null, 1001, 100, "deposit", LocalDateTime.of(2015, 11, 21, 19, 0)),
                new Transaction(accounts.get(1), accounts.get(4), 1002, 100, "deposit", LocalDateTime.of(2016, 3, 1, 9, 0)),
                new Transaction(null, accounts.get(2), 1003, 100, "withdraw", LocalDateTime.of(2016, 11, 3, 11, 21)),
                new Transaction(null, accounts.get(3), 1004, 100, "deposit", LocalDateTime.of(2017, 11, 5, 9, 0)),
                new Transaction(accounts.get(4), accounts.get(2), 1005, 100, "deposit", LocalDateTime.of(2018, 11, 11, 16, 11))
        );
    }

    public void makeDeposit(Account account, int tranID, double amount) {
        account.updateBalance(amount);
        new Transaction(account, null, tranID, amount, "deposit", LocalDateTime.now(), account.getBalance(), -1);
    }

    public void makeWithdraw(Account account, int tranID, double amount) {
        account.updateBalance(0 - amount);
        new Transaction(null, account, tranID, amount, "withdraw", LocalDateTime.now(), -1, account.getBalance());
    }

    public void makeTransfer(Account fromAccount, Account toAccount, int tranID, double amount) {
        fromAccount.updateBalance(amount);
        toAccount.updateBalance(0 - amount);
        new Transaction(toAccount, fromAccount, tranID, amount, "deposit", LocalDateTime.now(), toAccount.getBalance(), fromAccount.getBalance());
    }

    //transactions
    //      .stream()
    //    .forEach(System.out::println);
}
