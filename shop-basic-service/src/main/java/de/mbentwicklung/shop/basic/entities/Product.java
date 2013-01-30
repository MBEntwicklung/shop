package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Ein Produkt im Shop
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
public class Product extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4273816107451383224L;

	/**
	 * Name des Produktes
	 */
	private String name;
	/**
	 * Beschreibungstext des Produktes
	 */
	private String text;

	/**
	 * JPA Konstruktor
	 */
	Product() {
		super();
	}

	/**
	 * Konstruktor
	 * 
	 * @param name Name des Produktes
	 * @param text Beschreibungstext des Produktes
	 */
	public Product(final String name, final String text) {
		super();
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return Name des Produktes
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name Name des Produktes
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return Beschreibungstext des Produktes
	 */
	public String getText() {
		return text;
	}

	/**
	 * Setter
	 * 
	 * @param text Beschreibungstext des Produktes
	 */
	public void setText(String text) {
		this.text = text;
	}
}
