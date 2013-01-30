package de.mbentwicklung.shop.basic.services;

import org.springframework.beans.factory.annotation.Required;

import de.mbentwicklung.shop.basic.entities.User;
import de.mbentwicklung.shop.basic.repositories.AddressRepository;

public class UserRegistrationServiceImpl implements UserRegistrationService {

	private AddressRepository addressRepository;
	
	public User register() {
		return null;
	}

	
	@Required
	public void setAddressRepository(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
}
