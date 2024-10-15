package com.stream.comment.feedback.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
@Builder(toBuilder = true)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "user", uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"),
		@UniqueConstraint(columnNames = "email") 
	})
public class User extends AuditorEntity {


	private static final long serialVersionUID = 7364820073604547474L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// Use UUID too and also implement in CustomUserDEatils

	@Column(name = "username", nullable = false, unique = true, length = 500)
	private String username;

	@Column(name = "email", nullable = false, unique = true, length = 500)
	private String email;

	@Column(name = "password", nullable = false, length = 500)
	private String password;

	@Column(name = "first_name", nullable = true, length = 500)
	private String firstName;

	@Column(name = "last_name", nullable = true, length = 500)
	private String lastName;

	@Default
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLES", joinColumns = {@JoinColumn(name = "USER_ID") }, inverseJoinColumns = {@JoinColumn(name = "ROLE_ID") })
    private Set<Role> roles  = new HashSet<>();

	@CreatedDate
	@Column(name = "created", nullable = true)
	private LocalDateTime created;

	@LastModifiedDate
	@Column(name = "modified", nullable = true)
	private LocalDateTime modified;
	
	public User() {}
	public User(String username, String email, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public User(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		
	}
}