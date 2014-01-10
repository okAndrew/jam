package com.savruksergiy.jam.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class User {

    private long id;
    private String login;
	private String email;
    private String password;
    private double karma;
    private String sex;
    private int language;
    private int photo;
    private boolean isDelete;
    private boolean isBanned;
    
    public void setKarma(double karma) {
        this.karma = karma;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    public void setIsBanned(boolean isBanned) {
        this.isBanned = isBanned;
    }

    public void setRegistered(Timestamp registered) {
        this.registered = registered;
    }

    public double getKarma() {
        return karma;
    }

    public String getSex() {
        return sex;
    }

    public int getLanguage() {
        return language;
    }

    public int getPhoto() {
        return photo;
    }

    public boolean getIsDelete() {
        return isDelete;
    }

    public boolean getIsBanned() {
        return isBanned;
    }

    public Timestamp getRegistered() {
        return registered;
    }

    private Timestamp registered;


    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {

        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User() {
    }

    @Override
    public String toString() {
        StringBuilder user = new StringBuilder();

        user.append("User[");
        user.append("id: ").append(id).append(", ");
        user.append("login: ").append(login).append(", ");
        user.append("email: ").append(email).append(", ");
        user.append("password: ").append(password);
        user.append("];");

        return user.toString();
    }
}