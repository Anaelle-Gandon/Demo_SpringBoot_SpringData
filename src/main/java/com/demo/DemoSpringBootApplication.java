package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.EntityRepository;
import com.demo.dao.ICategoryRepository;
import com.demo.dao.IProductRepository;
import com.demo.entities.Category;
import com.demo.entities.Product;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoSpringBootApplication.class, args);
		//EntityRepository<Product> productDaoImpl = ctx.getBean(EntityRepository.class);
		
		IProductRepository productDaoImpl = ctx.getBean(IProductRepository.class);
		
		ICategoryRepository catDaoImpl = ctx.getBean(ICategoryRepository.class);
		
		/*Category cat1 = new Category("Jeans");
		Category cat2 = new Category("Dresse");
		Category cat3 = new Category("Basic Top");
		
		catDaoImpl.save(cat1);
		catDaoImpl.save(cat2);
		catDaoImpl.save(cat3);
		
		productDaoImpl.save(new Product("Skinny", 19, 2, cat1));
		productDaoImpl.save(new Product("Shapping", 23, 9, cat1));
		productDaoImpl.save(new Product("Short dresse", 35, 20, cat2));
		productDaoImpl.save(new Product("Jersey dresse", 55.5, 12, cat2));
		productDaoImpl.save(new Product("Long T-shirt", 18, 8, cat3));
		productDaoImpl.save(new Product("Short T-shirt", 15.5, 32, cat3));*/
		
		List<Product> products = productDaoImpl.findByKW("%dresse");
		
		for(Product p: products) {
			
			System.out.println(p.getDes());
		}
		
		List<Product> allProducts = productDaoImpl.findAll();
		
		for(Product p: allProducts) {
			
			System.out.println(p.getDes());
		}
		
		List<Category> categories = catDaoImpl.findByKW("%s%");
		
		for(Category cat: categories) {
			
			System.out.println(cat.getCatName());
		}
		
	}
	
	
}
