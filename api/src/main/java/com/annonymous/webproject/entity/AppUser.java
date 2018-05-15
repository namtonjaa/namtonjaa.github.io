package com.annonymous.webproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPUSER")
public class AppUser {

    @Id
    @Column(name = "USERID")
    @JsonIgnore
    private String userId;

    @Column(name = "USERNAME")
    private String userName;

    @Column(name = "PASSWORD")
    @JsonIgnore
    private String password;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "USERTYPE")
    private String userType;

    public AppUser() {
    }

    public AppUser(String userId, String userName, String passWord, String firstName, String lastName, String userType) {
        this.userId = userId;
        this.userName = userName;
        this.password = passWord;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
