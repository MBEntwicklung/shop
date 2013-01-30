/**
 * 
 */
package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Product;

/**
 *
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}
