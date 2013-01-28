package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Address extends AbstractPersistable<Long> {
	
	private User user;
	private String street;
	private String housenumber;
	private String city;
	private String postcode;
	private Country country;

	Address() {
		super();
	}

	public Address(User user, String street, String housenumber, String city,
			String postcode, Country country) {
		super();
		this.user = user;
		this.street = street;
		this.housenumber = housenumber;
		this.city = city;
		this.postcode = postcode;
		this.country = country;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
}
