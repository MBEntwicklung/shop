package de.mbentwicklung.shop.basic.entities;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Eine Bestellung im Shop
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
@Entity
public class Order extends AbstractPersistable<Long> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8333827103099964377L;

	/**
	 * User
	 */
	private User user;

	/**
	 * Gekaufte Produkte
	 */
	private List<Product> products;

	/**
	 * JPA Konstruktor
	 */
	Order() {
		super();
	}

	/**
	 * Konstruktor
	 * 
	 * @param user User
	 * @param products Gekaufte Produkte
	 */
	public Order(final User user, final List<Product> products) {
		super();
		this.user = user;
		this.products = products;
	}

	/**
	 * Getter
	 * 
	 * @return User
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Setter
	 * 
	 * @param user User
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Getter
	 * 
	 * @return Gekaufte Produkte
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * Setter
	 * 
	 * @param products Gekaufte Produkte
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
