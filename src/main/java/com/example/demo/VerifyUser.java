package com.example.demo;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUser {
    private Label email;
    String userEmail = email.getText();
    private Label password;
    String userPass = password.getText();

    public boolean checkForDigits() {
        Pattern digits = Pattern.compile("[\\d]");
        Matcher matcher = digits.matcher((CharSequence) password);
        return matcher.find();
    }

    public boolean checkForLetters() {
        Pattern chars = Pattern.compile("[a-z]");
        Matcher matcher = chars.matcher((CharSequence) password);
        return matcher.find();
    }
}
