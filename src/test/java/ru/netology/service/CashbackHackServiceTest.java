package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainLower1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = cashbackHackService.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIf1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainOver1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1200;

        int expected = 800;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }
}