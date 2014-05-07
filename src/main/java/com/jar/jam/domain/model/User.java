package com.jar.jam.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;

import com.jar.jam.domain.enums.UserRoles;

@Entity
@Table(name = "users")
@XmlRootElement
public class User implements Serializable {

    private static final long serialVersionUID = 2274392683998840860L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "login")
    private String login;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRoles role;

    @Column(name = "raiting")
    private Double raiting;

    @Column(name = "is_deleted", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isDeleted;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public UserRoles getRole() {
	return role;
    }

    public void setRole(UserRoles role) {
	this.role = role;
    }

    public Double getRaiting() {
	return raiting;
    }

    public void setRaiting(Double raiting) {
	this.raiting = raiting;
    }

    public boolean isDeleted() {
	return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
	this.isDeleted = isDeleted;
    }

}
