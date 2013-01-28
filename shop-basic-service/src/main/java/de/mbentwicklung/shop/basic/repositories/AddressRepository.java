package de.mbentwicklung.shop.basic.repositories;

import org.springframework.data.repository.CrudRepository;

import de.mbentwicklung.shop.basic.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
