package com.favcode.oeuniondentalcare.repository;

import com.favcode.oeuniondentalcare.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
