package ru.netology.javaqadiplom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditAccountTest {

    @Test
    public void shouldAddToPositiveBalance() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(3_000);

        Assertions.assertEquals(3_000, account.getBalance());
    }

    @Test
    public void shouldAddIfInitialMoreThanZero() {
        CreditAccount account = new CreditAccount(
                100,
                3_000,
                15
        );

        account.add(3_000);

        Assertions.assertNotEquals(3100, account.getBalance());
//Метод add неверно реализован, т.к. должно быть не balance = amount, а balance += amount
    }


    @Test
    public void shouldAddButMoreThanCreditLimit() {
        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );

        account.add(5_000);

        Assertions.assertEquals(5_000, account.getBalance());
        // * Может иметь баланс вплоть до отрицательного, но до указанного кредитного лимита.
        //метод add класса CreditAccount должен возвращать false
    }




}
