package de.mbentwicklung.shop.basic.entities;

import java.util.Date;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Comment extends AbstractPersistable<Long> {

	private Product product;
	private User user;
	private String text;
	private Date creationDate;

	Comment() {

	}

	public Comment(final Product product, final User user, final String text,
			final Date creationDate) {

		super();
		this.product = product;
		this.user = user;
		this.text = text;
		this.creationDate = creationDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
