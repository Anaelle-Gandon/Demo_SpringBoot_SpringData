package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
	@Query("select cat from Category cat where cat.catName like :x")	
	public List<Category> findByKW(@Param("x")String kw);
}
