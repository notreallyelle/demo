package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField email;
    public TextField password;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onButtonClick() {

        String userEmail = email.getText();
        String userPass = password.getText();

        boolean b = userPass.length() < 7;
        if (b = true) {
            welcomeText.setText("Password must be longer than 7 characters.");
        }
        else {
            welcomeText.setText("");
    }
}}