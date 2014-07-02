package com.brandonteng.letsplay;

/**
 * Created by brandonteng on 7/2/14.
 */
public class SavingsAccount {

    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public int balance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
