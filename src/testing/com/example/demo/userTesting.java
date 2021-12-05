package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class userTesting {

    @Test
    public void CheckPassForDigits() {
        VerifyUser one = new VerifyUser("email", "AbcDe12!");
        VerifyUser two = new VerifyUser("email", "ABCDef!!");
        assertTrue(one.checkForDigits());
        assertFalse(two.checkForDigits());
    }

    @Test
    public void CheckPassForLetters() {
        VerifyUser one = new VerifyUser("email", "AbcDe12!");
        VerifyUser two = new VerifyUser("email", "1222334!!");
        assertTrue(one.checkForLetters());
        assertFalse(two.checkForLetters());
    }

    @Test
    public void CheckPassForSpecialChars() {
        VerifyUser one = new VerifyUser("email", "AbcDe12!#");
        VerifyUser two = new VerifyUser("email", "122233AD");
        assertTrue(one.checkForSpecialChars());
        assertFalse(two.checkForSpecialChars());
    }

    @Test
    public void CheckPassLength() {
        VerifyUser one = new VerifyUser("email", "AbcDe12!#2");
        VerifyUser two = new VerifyUser("email", "1a!");
        assertTrue(one.checkForLength());
        assertFalse(two.checkForLength());
    }

    @Test
    public void VerifyEmail(){
        VerifyUser one = new VerifyUser("email12y@gmail.com", "password");
        VerifyUser two = new VerifyUser("notEmail", "password");
        assertTrue(one.checkEmail());
        assertFalse(two.checkEmail());
    }

}
