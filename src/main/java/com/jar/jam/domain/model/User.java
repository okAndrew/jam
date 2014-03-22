package com.jar.jam.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column(name = "login")
	private String login;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private UserRoles role;
	
	@Column(name = "raiting")
	private Double raiting;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		long temp;
		temp = Double.doubleToLongBits(raiting);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (Double.doubleToLongBits(raiting) != Double
				.doubleToLongBits(other.raiting))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder user = new StringBuilder();

		user.append("User [id=").append(id);
		user.append(", email=").append(email);
		user.append(", password=").append(password);
		user.append(", login=").append(login);
		user.append(", role=").append(role);
		user.append(", raiting=").append(raiting);
		user.append("]");

		return user.toString();
	}

}
