package com.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product implements Serializable {
@Id @GeneratedValue
	private Long id;
@Column(length=50)
	private String des;
	private double price;
	private int qtity;
	@ManyToOne
	@JoinColumn(name="ID_Cat")
	private Category category;
		
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String des, double price, int qtity) {
		super();
		this.des = des;
		this.price = price;
		this.qtity = qtity;
	}
	
	
	public Product(String des, double price, int qtity, Category category) {
		super();
		this.des = des;
		this.price = price;
		this.qtity = qtity;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtity() {
		return qtity;
	}

	public void setQtity(int qtity) {
		this.qtity = qtity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

		
}
