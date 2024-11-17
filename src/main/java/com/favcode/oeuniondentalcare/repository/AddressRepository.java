package com.favcode.oeuniondentalcare.repository;

import com.favcode.oeuniondentalcare.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
