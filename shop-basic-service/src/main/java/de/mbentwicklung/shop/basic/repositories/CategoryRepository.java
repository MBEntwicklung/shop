/**
 * 
 */
package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Category;

/**
 *
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
