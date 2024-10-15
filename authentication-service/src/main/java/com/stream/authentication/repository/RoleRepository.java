package com.stream.authentication.repository;

import java.util.Optional;


import com.stream.authentication.model.Role;
import com.stream.authentication.model.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{


	
	Optional<Role> findByName(RoleEnum name);


}
