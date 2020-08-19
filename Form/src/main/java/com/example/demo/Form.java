package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Form_Table")
public class Form {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private long cellno;
	
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
	public long getCellno() {
		return cellno;
	}
	public void setCellno(long cellno) {
		this.cellno = cellno;
	}
	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", email=" + email + ", cellno=" + cellno + "]";
	}
	
	
	

}
