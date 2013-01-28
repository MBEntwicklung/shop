package de.mbentwicklung.shop.basic.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class User extends AbstractPersistable<Long> {

	private String login;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;

	User() {
		super();
	}

	public User(String login, String firstName, String lastName, String mail,
			String password) {
		super();
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
