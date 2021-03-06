package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Address;

/**
 * Repository for Adresses
 * 
 * @author Marc Bellmann <marc.bellmann@mb-entwicklung.de>
 */
public interface AddressRepository extends CrudRepository<Address, Long> {

}
