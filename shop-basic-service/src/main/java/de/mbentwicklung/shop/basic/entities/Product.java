package de.mbentwicklung.shop.basic.entities;

import java.util.List;

public class Product {

	private String name;
	private String text;
	private List<Image> images;

	Product() {
		super();
	}

	public Product(String name, String text, List<Image> images) {
		super();
		this.name = name;
		this.images = images;
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

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

}
