package tests.entities;

import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTests {

    @Test
    public void depositSholdIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
        double amount = 200.0;
        double expectdValue = 196.0;
        Account acc = new Account(1L, 0.0);

        acc.deposit(amount);

        Assertions.assertEquals(expectdValue, acc.getBalance());

    }

}
