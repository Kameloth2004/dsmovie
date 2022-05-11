package com.dvsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	
	public User() {
		
	}

	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}

	public Long getIs() {
		return id;
	}

	public void setIs(Long id) {
		this.id = id;
	}

	public String getE() {
		return email;
	}

	public void setE(String email) {
		this.email = email;
	}
	
	
}
