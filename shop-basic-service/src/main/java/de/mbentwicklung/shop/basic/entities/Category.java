package de.mbentwicklung.shop.basic.entities;

public class Category {

	private Category rootCategory;
	private String name;

	Category() {
		super();
	}

	public Category(Category rootCategory, String name) {
		super();
		this.rootCategory = rootCategory;
		this.name = name;
	}

	public Category getRootCategory() {
		return rootCategory;
	}

	public void setRootCategory(Category rootCategory) {
		this.rootCategory = rootCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
