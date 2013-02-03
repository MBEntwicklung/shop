package de.mbentwicklung.shop.basic.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import de.mbentwicklung.shop.basic.entities.Product;
import de.mbentwicklung.shop.basic.repositories.ProductRepository;

public class ProductOverviewServiceImpl implements ProductOverviewService {

	/**
	 * Repository für Datenbankzugriff auf Produkte
	 */
	private ProductRepository productRepository;

	/**
	 * {@inheritDoc}
	 */
	public List<Product> getProducts() {
		return Collections.unmodifiableList(
				this.productRepository.findAllAvailableProducts()
		);
	}

	/**
	 * Setter
	 * 
	 * @param productRepository Repository für Datenbankzugriff auf Produkte
	 */
	@Required
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
}
