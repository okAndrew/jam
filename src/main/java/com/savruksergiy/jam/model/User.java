package com.savruksergiy.jam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created with IntelliJ IDEA.
 * User: sergiy
 * Date: 11/21/13
 * Time: 8:48 AM
 */

@Entity
@Table(name = "users", catalog = "jam")
public class User implements Serializable {

    private long id;
    private String login;
    private String email;
    private String password;

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

    @Id
    @GeneratedValue(strategy = IDENTITY)

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

        user.append("User{").append("id='").append(id).append("\'");
        user.append(", login='").append(login).append("\'");
        user.append(", email='").append(email).append("\'");
        user.append(", password='").append(password).append("\'").append("}");

        return user.toString();
    }
}