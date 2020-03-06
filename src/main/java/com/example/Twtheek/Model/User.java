package com.example.Twtheek.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.swing.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Auto generate incremental number
    @Column(name = "userId")
    private int userId;
   @NotNull(message = "First name , Last name is required")
    @Size(min = 3, max = 20)
    @Column(name = "name")
    private String name;
    @Column(name = "national_Id")
    private int national_Id;
    @Email(message = "Enter a valid email address.")
    @Pattern(regexp=".+@.+\\.[a-z]+")
    @NotNull(message = "Email is required")
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phone_number;
//    @Pattern(regexp="(.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20}")
    @Column(name = "password")
    private String passwordField;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @Column(name = "enabled")
    private boolean enable=true;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userOrganization")
    private Organization userOrganization;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authority")
    private Authority authority;

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }




    public User(int userId,String name, int national_Id, String email, String phone_number, String passwordField, String dateOfBirth, boolean enable,Organization userOrganization) {
        this.name = name;
        this.national_Id = national_Id;
        this.email = email;
        this.phone_number = phone_number;
        this.passwordField = passwordField;
        this.dateOfBirth = dateOfBirth;
        this.userOrganization = userOrganization;
        this.userId=userId;
        this.enable=enable;
    }


    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Organization getUserOrganization() {
        return userOrganization;
    }

    public void setUserOrganization(Organization userOrganization) {
        this.userOrganization = userOrganization;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNational_Id() {
        return national_Id;
    }

    public void setNational_Id(int national_Id) {
        this.national_Id = national_Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField = passwordField;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
