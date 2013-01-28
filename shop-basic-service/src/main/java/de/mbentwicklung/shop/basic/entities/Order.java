package de.mbentwicklung.shop.basic.entities;

import java.util.List;

public class Order {

	private User user;
	
	private List<Product> products;

	Order() {
		super();
	}

	public Order(User user, List<Product> products) {
		super();
		this.user = user;
		this.products = products;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
