package com.stream.authentication.model;

import java.io.Serializable;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@AllArgsConstructor
@Builder(toBuilder = true)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "role")
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7092795090689266661L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "rolename", nullable = true, unique = false, length = 100)
	private RoleEnum name;
	
	public Role() {}
	public Role(RoleEnum name) {
		super();
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RoleEnum getName() {
		return name;
	}
	public void setName(RoleEnum name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
//  private Set<Role> roles  = new HashSet<>();
//public Role(RoleEnum name) {
//	super();
	//this.name = name;
//}	
//	public enum RoleEnum {
		
	//	ROLE_USER,
	 //   ROLE_MODERATOR,
	 //   ROLE_ADMIN

	//}
	

	
	
	
	
	

}