package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void TestAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4_100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void TestAmountEqualBoundaryt() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1_000;

        Assert.assertEquals(actual, expected);
    }

}
