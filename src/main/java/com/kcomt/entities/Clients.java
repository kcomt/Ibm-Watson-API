package com.kcomt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clients")
public class Clients {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@Size(min = 4, message = "Username must be atleast 4 charecters in length")
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Size(min = 4, message = "Username must be atleast 4 charecters in length")
	@Column(name = "dni", nullable = false, length = 100)
	private String dni;
	
	@Size(min = 2, message = "Email must be 5 charecters in length")
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@Size(min = 2, message = "Email must be 5 charecters in length")
	@Column(name = "phoneNumber", nullable = false, length = 100)
	private String phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
		
}
