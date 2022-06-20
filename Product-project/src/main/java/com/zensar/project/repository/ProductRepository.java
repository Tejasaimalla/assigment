package com.zensar.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zensar.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Query(value = "select * from Product where product_name=?1", nativeQuery = true)
	List<Product> test(@Param("name") String productName);

	@Query("from Product p where p.productName=?1 and p.productPrice=?2")
	List<Product> test1(@Param("name") String productName, @Param("price") int price);

}
