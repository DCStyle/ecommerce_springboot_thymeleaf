package com.se2sky.eshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.se2sky.eshop.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
