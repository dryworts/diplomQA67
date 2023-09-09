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
    //пополнить баланс на положительную сумму
    public void AddPositiveToBalance() {

        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        boolean expected = true;
        boolean actual = account.add(1_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    //пополнить баланс на отрицательную сумму
    public void AddNegativeToBalance() {

        CreditAccount account = new CreditAccount(
                0,
                5_000,
                15
        );
        boolean expected = false;
        boolean actual = account.add(-1_000);

        Assertions.assertEquals(expected, actual);
    }

    public void AddZeroToBalance() {

        CreditAccount account = new CreditAccount(
                10,
                5_000,
                15
        );
        boolean expected = false;
        boolean actual = account.add(0);

        Assertions.assertEquals(expected, actual);
    }


//
//    @Test
//    //проверка отрицательный баланс
//    public void shouldAddToNegativeBalance() {
//        CreditAccount account = new CreditAccount(
//                0,
//                5_000,
//                15
//        );
//
//        account.add(-3_000);
//
//        Assertions.assertEquals(3_000, account.getBalance());
//    }
//
//
//
//
//    @Test
//    public void shouldAddIfInitialMoreThanZero() {
//        CreditAccount account = new CreditAccount(
//                100,
//                3_000,
//                15
//        );
//
//        account.add(3_000);
//
//        Assertions.assertNotEquals(3100, account.getBalance());
////Метод add неверно реализован, т.к. должно быть не balance = amount, а balance += amount
//    }
//
//
//    @Test
//    public void shouldAddButMoreThanCreditLimit() {
//        CreditAccount account = new CreditAccount(
//                0,
//                5_000,
//                15
//        );
//
//        account.add(5_000);
//
//        Assertions.assertEquals(5_000, account.getBalance());
//        // * Может иметь баланс вплоть до отрицательного, но до указанного кредитного лимита.
//        //метод add класса CreditAccount должен возвращать false
//    }
//



}
