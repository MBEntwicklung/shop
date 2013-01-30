package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Repräsentiert ein Produktbild
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
public class Image extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6835848428455354264L;

	/**
	 * Bild für Produkt
	 */
	private Product product;

	/**
	 * JPA Konstruktor
	 */
	Image() {
		super();
	}

	/**
	 * Konstruktor
	 * @param product Bild für Produkt
	 */
	public Image(final Product product) {
		super();
		this.product = product;
	}

	/**
	 * Getter
	 * 
	 * @return Bild für Produkt
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Setter
	 * 
	 * @param product Bild für Produkt
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

}
