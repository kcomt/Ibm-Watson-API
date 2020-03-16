package com.kcomt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "plans")
public class Plans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@Size(min = 4, message = "Username must be atleast 4 charecters in length")
	@Column(name = "internetMegas", nullable = false, length = 100)
	private String internetMegas;
	
	@Size(min = 4, message = "Username must be atleast 4 charecters in length")
	@Column(name = "SMS", nullable = false, length = 100)
	private String SMS;
	
	@Size(min = 2, message = "Email must be 5 charecters in length")
	@Column(name = "cost", nullable = false, length = 100)
	private String cost;

	@ManyToOne
	@JoinColumn(name = "client_id", nullable = false)
	private Clients client;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInternetMegas() {
		return internetMegas;
	}

	public void setInternetMegas(String internetMegas) {
		this.internetMegas = internetMegas;
	}

	public String getSMS() {
		return SMS;
	}

	public void setSMS(String sMS) {
		SMS = sMS;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}
	
}
