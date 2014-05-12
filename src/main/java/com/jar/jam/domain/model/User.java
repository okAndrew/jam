package com.jar.jam.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.jar.jam.domain.enums.SexType;
import com.jar.jam.domain.enums.UserRoles;
import com.jar.jam.utils.CustomDateDeserializer;
import com.jar.jam.utils.CustomDateSerializer;

@Entity
@Table(name = "users")
@JsonSerialize(include = Inclusion.NON_NULL)
public class User implements Serializable {

    private static final long serialVersionUID = 2274392683998840860L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    @NotNull @Pattern(regexp="")
    private String email;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthday")
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private SexType sex;

    @Column(name = "login")
    private String login;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRoles role;

    @Column(name = "raiting")
    private Double raiting;

    @Column(name = "is_delete", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean isDelete;

    public Long getId() {
	return id;
    }

    public String getEmail() {
	return email;
    }

    public String getPassword() {
	return password;
    }

    public String getLogin() {
	return login;
    }

    public UserRoles getRole() {
	return role;
    }

    public Double getRaiting() {
	return raiting;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public void setRole(UserRoles role) {
	this.role = role;
    }

    public void setRaiting(Double raiting) {
	this.raiting = raiting;
    }

    public boolean getIsDelete() {
	return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
	this.isDelete = isDelete;
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

    @JsonSerialize(using = CustomDateSerializer.class)
    public DateTime getBirthday() {
	return birthday;
    }

    @JsonDeserialize(using = CustomDateDeserializer.class)
    public void setBirthday(DateTime birthday) {
	this.birthday = birthday;
    }

    public SexType getSex() {
	return sex;
    }

    public void setSex(SexType sex) {
	this.sex = sex;
    }

    public void setDelete(boolean isDelete) {
	this.isDelete = isDelete;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", email=" + email + ", password=" + password
		+ ", firstName=" + firstName + ", lastName=" + lastName
		+ ", birthday=" + birthday + ", sex=" + sex + ", login="
		+ login + ", role=" + role + ", raiting=" + raiting
		+ ", isDelete=" + isDelete + "]";
    }
    
}
