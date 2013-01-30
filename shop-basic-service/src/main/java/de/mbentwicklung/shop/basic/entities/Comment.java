package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Repräsentiert einen Kommentar für ein Produkt
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
public class Comment extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8834221505734911531L;

	/**
	 * Kommentar für Produkt
	 */
	private Product product;

	/**
	 * Kommentar von User
	 */
	private User user;

	/**
	 * Kommtentar
	 */
	private String text;

	/**
	 * JPA Konstruktur
	 */
	Comment() {
		super();
	}

	/**
	 * Konstruktor
	 * 
	 * @param product Kommentar für Produkt
	 * @param user Kommentar von User
	 * @param text Kommtentar
	 * @param creationDate Erstelldatum
	 */
	public Comment(final Product product, final User user, final String text) {
		super();
		this.product = product;
		this.user = user;
		this.text = text;
	}

	/**
	 * Getter
	 * 
	 * @return Kommentar für Produkt
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Setter
	 * 
	 * @param product Kommentar für Produkt
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Getter
	 * 
	 * @return Kommentar von User
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Setter
	 * 
	 * @param user Kommentar von User
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Getter
	 * 
	 * @return Kommtentar
	 */
	public String getText() {
		return text;
	}

	/**
	 * Setter
	 * 
	 * @param text Kommtentar
	 */
	public void setText(String text) {
		this.text = text;
	}
}
