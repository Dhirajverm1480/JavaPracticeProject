package com.dhir.atsecom.repository;

import com.dhir.atsecom.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByTitle(String title);

    Product findByCategory(String category);
}
