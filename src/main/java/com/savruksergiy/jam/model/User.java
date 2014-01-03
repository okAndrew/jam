package com.savruksergiy.jam.model;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 11/21/13
 * Time: 8:48 AM
 */

public class User {

    private long id;
    private String login;
    private String email;
    private String password;
    private double karma;
    private String sex;
    private int language;
    private int photo;

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

    public void setIs_delete(boolean is_delete) {
        this.is_delete = is_delete;
    }

    public void setIs_banned(boolean is_banned) {
        this.is_banned = is_banned;
    }

    public void setRegistered(Timestamp registered) {
        this.registered = registered;
    }

    private boolean is_delete;
    private boolean is_banned;

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

    public boolean isIs_delete() {
        return is_delete;
    }

    public boolean isIs_banned() {
        return is_banned;
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