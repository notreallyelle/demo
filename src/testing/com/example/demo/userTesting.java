package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class userTesting {

    @Test
    public void CheckPassforDigits() {
        User one = new User("email", "AbcDe12!");
        User two = new User("email", "ABCDef!!");
        assertTrue(one.checkForDigits());
        assertFalse(two.checkForDigits());
    }

}
