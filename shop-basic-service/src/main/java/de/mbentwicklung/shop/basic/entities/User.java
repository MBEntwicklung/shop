package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Angemeldeter User
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
public class User extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3513555424556150235L;

	/**
	 * Login Name
	 */
	private String login;

	/**
	 * Vorname
	 */
	private String firstName;

	/**
	 * Nachname
	 */
	private String lastName;

	/**
	 * E-Mail Adresse
	 */
	private String mail;

	/**
	 * Verschlüsseltes Passwort
	 */
	private String password;

	/**
	 * JPA Konstruktor
	 */
	User() {
		super();
	}

	/**
	 * Konstruktor
	 * 
	 * @param login Login Name
	 * @param firstName Vorname
	 * @param lastName Nachname
	 * @param mail E-Mail Adresse
	 * @param password Verschlüsseltes Passwort
	 */
	public User(final String login, final String firstName, final String lastName, final String mail,
			final String password) {
		super();
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
	}

	/**
	 * Getter
	 * 
	 * @return Login Name
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Setter
	 * 
	 * @param login Login Name
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Getter
	 * 
	 * @return Vorname
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter
	 * 
	 * @param firstName Vorname
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Getter
	 * 
	 * @return Nachname
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter
	 * 
	 * @param lastName Nachname
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter
	 * 
	 * @return E-Mail Adresse
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Setter
	 * 
	 * @param mail E-Mail Adresse
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Getter
	 * 
	 * @return Verschlüsseltes Passwort
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter
	 * 
	 * @param password Verschlüsseltes Passwort
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
