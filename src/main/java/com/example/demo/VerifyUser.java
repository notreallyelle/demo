package com.example.demo;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUser {
    private String email;
    private String password;

    public VerifyUser(String email, String password){
        this.email = email;
        this.password = password;
    }

    public boolean checkForDigits() {
        Pattern digits = Pattern.compile("[\\d]");
        Matcher matcher = digits.matcher(this.password);
        return matcher.find();
    }

    public boolean checkForLetters() {
        Pattern chars = Pattern.compile("[a-z]");
        Matcher matcher = chars.matcher(this.password);
        return matcher.find();
    }

    public boolean checkForSpecialChars() {
        Pattern specialChars = Pattern.compile("[*^&@!.]");
        Matcher matcher = specialChars.matcher(this.password);
        return matcher.find();
    }

    public boolean checkForLength() {
        return password.length() > 7;
    }
}
