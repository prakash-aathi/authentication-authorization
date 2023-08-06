package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.examly.springapp.dto.ERole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String username;
	private String mobileNumber;
	private String password;
	@Enumerated(EnumType.STRING)
    private ERole userRole;
    
    public UserModel(String email, String mobileNumber, String password, ERole userRole) {
		super();
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.userRole = userRole;
	}
    
}
