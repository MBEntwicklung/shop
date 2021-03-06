/**
 * 
 */
package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Image;

/**
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface ImageRepository extends CrudRepository<Image, Long> {

}
