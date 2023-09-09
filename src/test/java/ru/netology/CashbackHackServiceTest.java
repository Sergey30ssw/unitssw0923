package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
    @Test
    public void TestAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected,actual);
    }
    @Test
    public void TestAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4_100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected,actual);
    }
    @Test
    public void TestBoundaryEqualsAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1_000;

        assertEquals(expected,actual);
    }

}
