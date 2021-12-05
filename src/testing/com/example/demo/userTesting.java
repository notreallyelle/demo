package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class userTesting {

    @Test
    public void CheckPassforDigits() {
        VerifyUser one = new VerifyUser("email", "AbcDe12!");
        VerifyUser two = new VerifyUser("email", "ABCDef!!");
        assertTrue(one.checkForDigits());
        assertFalse(two.checkForDigits());
    }

}
