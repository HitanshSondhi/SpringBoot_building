package com.example.jpa;

import com.example.jpa.entity.ProductEntity;
import com.example.jpa.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	ProductRepository productRepository;

//	@BeforeEach
//	void setup() {
//		productRepository.deleteAll();
//	}

	@Test
	void contextLoads() {
	}

//	@Test
//	void testRepository(){
//		ProductEntity productEntity= ProductEntity.builder()
//				.sku("nestle245").title("Pepsi")
//				.price(BigDecimal.valueOf(112.45)).quantity(10).build();
//
//		ProductEntity savedProductEntity=productRepository.save(productEntity);
//
//	}

	@Test
	void getRepository(){
		List<ProductEntity> entities;
        entities = productRepository.findByTitle("Pepsi");
        System.out.println(entities);
	}

}
