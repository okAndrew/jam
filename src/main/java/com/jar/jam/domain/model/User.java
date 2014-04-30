package com.jar.jam.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.jar.jam.domain.enums.SexType;
import com.jar.jam.domain.enums.UserRoles;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "birthday")
	@Temporal(value = TemporalType.DATE)
	private Date birthday;

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
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

}
