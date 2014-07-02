package com.brandonteng.finances;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by brandonteng on 7/2/14.
 */
public class _TestSomething {

    @Test
    public void depositAndWithdrawal() {
        SavingsAccount account = new SavingsAccount();
        account.deposit(100);

        //Comparing two ways two assert
        assertThat("after deposit", account.balance(), is(100));
       // assertEquals(100, account.balance());
        account.withdraw(50);
        assertThat("after withdrawal", account.balance(), is(50));
    }

    @Test
    public void negativeBalanceIsJustFine() {
        SavingsAccount account = new SavingsAccount();
        account.withdraw(75);
        assertThat(account.balance(), is(-75));
    }

    @Test
    public void nextYear() {
        SavingsAccount account = new SavingsAccount();
        account.deposit(10000);
        SavingsAccount nextYear = account.nextYear(10);
        assertThat(nextYear.balance(), is(11000));
    }



}
