package com.udemy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	// Debajo marcamos las columnas.
	
	@Id
	@GeneratedValue //para que hibernate lo genere automaticamente
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname ;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="city")
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Contact(String firstname, String lastname, String telephone, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}
	
	public Contact(){} //El contructor vacio es para que hibernate pueda gestionar esta entidad

}
