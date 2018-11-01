package com.playtech;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Bank {
    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account("Peeter","Jalakas",1000),
                new Account("Reet","Kask",100),
                new Account("Villu","Vaher",2000),
                new Account("Janar","Saar",1000),
                new Account("Ülo","Tamm",1000)
        );
        List<Transaction> transactions = Arrays.asList(
                new Transaction(accounts.get(0), 1000, 100, "deposit", LocalDateTime.now()),
                new Transaction(accounts.get(0), 1001, 100, "deposit", LocalDateTime.of(2015, 11, 21, 19, 0)),
                new Transaction(accounts.get(1), 1002, 100, "deposit", LocalDateTime.of(2016, 3, 1, 9, 0) ),
                new Transaction(accounts.get(2), 1003, 100, "withdraw", LocalDateTime.of(2016, 11, 3, 11, 21) ),
                new Transaction(accounts.get(3), 1004, 100, "deposit", LocalDateTime.of(2017, 11, 5, 9, 0) ),
                new Transaction(accounts.get(4), 1005, 100, "deposit", LocalDateTime.of(2018, 11, 11, 16, 11) )
        );
//transactions
  //      .stream()
    //    .forEach(System.out::println);
    }

    public void makeDeposit(Account account, int tranID, double amount) {
        account.updateBalance(amount);
        double endBalance = account.getBalance() + amount;
        new Transaction(account, tranID, amount, "deposit", LocalDateTime.now(), endBalance);
    }

    public void makeWithdraw(Account account, int tranID, double amount) {
        account.updateBalance(0-amount);
        double endBalance = account.getBalance() - amount;
        new Transaction(account, tranID, amount, "withdraw", LocalDateTime.now(), endBalance);
    }

}
//   Account account,int tranID, double amount, String type, SimpleDateFormat timeStamp, double endBalance