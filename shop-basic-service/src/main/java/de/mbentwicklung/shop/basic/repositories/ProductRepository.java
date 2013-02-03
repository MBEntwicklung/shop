/**
 * 
 */
package de.mbentwicklung.shop.basic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Product;

/**
 * Repositiory für Datenbankzugriff auf Produkte
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

	/**
	 * Getter
	 * 
	 * @return Alle verfügbaren Produkte
	 */	
	@Query("SELECT p from Product p")
	List<Product> findAllAvailableProducts();

}
