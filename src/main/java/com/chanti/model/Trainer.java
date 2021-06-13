package com.chanti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="trainers")
@Data
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
public class Trainer 
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int exp;
	private String domain;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Trainer() {
	}
	public Trainer(int id, String name, String email, int exp, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.exp = exp;
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", email=" + email + ", exp=" + exp + ", domain=" + domain
				+ "]";
	}
	//For testing @Tharun created this constructor 
	public Trainer(String name, String email, int exp, String domain) {
		super();
		this.name = name;
		this.email = email;
		this.exp = exp;
		this.domain = domain;
	}
	
}
