package com.company;

public class User {

    // Attribute -- Field

    private String firstName;
    private String lastName;
    private String userName;
    private String eMail;
    private int password;
    private int newPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getPassword() { return password; }

    public void setPaswoord(int password) {
        this.password = password;
    }


    public int getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(int newPassword) {
        this.newPassword = newPassword;
    }
}
