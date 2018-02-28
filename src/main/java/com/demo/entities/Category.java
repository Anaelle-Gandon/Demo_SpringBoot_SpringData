package com.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category implements Serializable {
@Id @GeneratedValue
	private Long id;
@Column(length=50)
	private String catName;
	@OneToMany(mappedBy="category", fetch=FetchType.LAZY)
	private Collection<Product> products;
	
		
	public Category() {
		// TODO Auto-generated constructor stub
	}
	

	public Category(String catName) {
		super();
		this.catName = catName;
	}


	public String getCatName() {
		return catName;
	}


	public void setCatName(String catName) {
		this.catName = catName;
	}


	public Collection<Product> getProducts() {
		return products;
	}


	public void setProducts(Collection<Product> products) {
		this.products = products;
	}


	public Long getId() {
		return id;
	}

	
	
	
}
