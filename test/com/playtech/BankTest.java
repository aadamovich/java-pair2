package com.playtech;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;

    @BeforeEach
    void setup() {
        bank = new Bank();
        bank.fillTempData();
    }

    @Test
    void transactionCount() {
        int tCount = bank.transactions.size();

        bank.makeDeposit(bank.accounts.get(4), 10011, 1000.00);
        tCount++;
        assertEquals(tCount, bank.transactions.size());

        bank.makeWithdraw(bank.accounts.get(3), 10012, 1000.00);
        tCount++;
        assertEquals(tCount, bank.transactions.size());

        bank.makeTransfer(bank.accounts.get(0), bank.accounts.get(2), 10012, 1000.00);
        tCount++;
        assertEquals(tCount, bank.transactions.size());
    }
}