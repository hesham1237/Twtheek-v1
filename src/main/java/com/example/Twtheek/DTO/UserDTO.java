package com.example.Twtheek.DTO;

public class UserDTO {
    private String name;
    private String passwordField;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public UserDTO(String name, String passwordField, String email) {
        this.name = name;
        this.passwordField = passwordField;
        this.email = email;
    }

    public UserDTO() {
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    }

