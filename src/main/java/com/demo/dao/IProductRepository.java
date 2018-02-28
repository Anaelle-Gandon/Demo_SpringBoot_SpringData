package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {
	@Query("select p from Product p where p.des like :x")	
	public List<Product> findByKW(@Param("x")String kw);
	
	
}
