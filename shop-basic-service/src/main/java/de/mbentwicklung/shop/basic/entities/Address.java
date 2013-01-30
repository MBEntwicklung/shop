package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Repräsentiert eine Versandadresse
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
public class Address extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2372807506651419547L;

	/**
	 * Adresse des Users
	 */
	private User user;

	/**
	 * Vorname
	 */
	private String firstName;

	/**
	 * Nachname
	 */
	private String lastName;

	/**
	 * Straße
	 */
	private String street;

	/**
	 * Hausnummer
	 */
	private String housenumber;

	/**
	 * Adresszusatz
	 */
	private String addition; 
	
	/**
	 * Stadt
	 */
	private String city;

	/**
	 * Postleitzahl
	 */
	private String postcode;

	/**
	 * Land
	 */
	private Country country;

	/**
	 * JPA Konstruktur
	 */
	Address() {
		super();
	}

	/**
	 * Konstruktur
	 * 
	 * @param user Adresse des Users
	 * @param street Straße
	 * @param housenumber Hausnummer
	 * @param city Stadt
	 * @param postcode Postleitzahl
	 * @param country Stadt
	 */
	public Address(final User user, final String street, final String housenumber, final String city,
			final String postcode, final Country country) {

		super();
		this.user = user;
		this.street = street;
		this.housenumber = housenumber;
		this.city = city;
		this.postcode = postcode;
		this.country = country;
	}

	/**
	 * Getter
	 * 
	 * @return Adresse des Users
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Setter
	 * 
	 * @param user Adresse des Users
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Getter
	 * 
	 * @return Straße
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Setter
	 * 
	 * @param street Straße
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Getter
	 * 
	 * @return Hausnummer
	 */
	public String getHousenumber() {
		return housenumber;
	}

	/**
	 * Setter
	 * 
	 * @param housenumber Hausnummer
	 */
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	/**
	 * Getter
	 * 
	 * @return Stadt
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter
	 * 
	 * @param city Stadt
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter
	 * 
	 * @return Postleitzahl
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * Setter
	 * 
	 * @param postcode Postleitzahl
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * Getter
	 * 
	 * @return Land
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Setter
	 * 
	 * @param country Land
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
}
