package com.project.entity;

import java.awt.datatransfer.Transferable;
import java.time.LocalDateTime;

import com.project.enums.HospitalRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private long mobile;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private HospitalRoles role;
	@Column(nullable = false)
	private Boolean isActive;
	@Column(nullable = false, updatable = false)
	private LocalDateTime createdAt;
}
