package de.mbentwicklung.shop.basic.services;

import java.util.List;

import de.mbentwicklung.shop.basic.entities.Category;

public interface CategoryService {

	List<Category> getAllRootCategories();
	
	List<Category> getSubCategories();
}
