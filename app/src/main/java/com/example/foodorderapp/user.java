package com.example.foodorderapp;

public class user {
    String userName, userEmail, userAddress;
    Integer userNumber;

    public user() {
    }

    public user(String userNumber, String userName, String userEmail, String userAddress) {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public user(String userName, String userEmail, String userAddress, Integer userNumber) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.userNumber = userNumber;
    }
}

