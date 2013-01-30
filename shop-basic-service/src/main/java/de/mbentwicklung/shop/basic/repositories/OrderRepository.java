/**
 * 
 */
package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Order;

/**
 *
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

}
