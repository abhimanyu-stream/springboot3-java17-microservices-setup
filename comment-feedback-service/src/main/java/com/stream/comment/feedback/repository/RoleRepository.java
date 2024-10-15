package com.stream.comment.feedback.repository;

import java.util.Optional;


import com.stream.comment.feedback.model.RoleEnum;
import com.stream.comment.feedback.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{


	
	Optional<Role> findByName(RoleEnum name);


}
