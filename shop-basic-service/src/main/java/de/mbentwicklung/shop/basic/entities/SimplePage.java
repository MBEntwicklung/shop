package de.mbentwicklung.shop.basic.entities;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class SimplePage extends AbstractPersistable<Long> {
	private String name;
	private String text;

	SimplePage() {
		super();
	}

	public SimplePage(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
