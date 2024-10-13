package com.dhir.atsecom.service;

import com.dhir.atsecom.entity.Product;
import com.dhir.atsecom.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(List<Product> productList) {
        return productRepository.saveAll(productList);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product getProductByTitle(String title) {
        return productRepository.findByTitle(title);
    }

    public Product getProductByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product deleted " + id;
    }

    public Product updateProduct(Product product) {
        Product oldProduct = productRepository.findById(product.getId()).orElse(null);
//        oldProduct.setId(product.getId());
        oldProduct.setTitle(product.getTitle());
        oldProduct.setDescription(product.getDescription());
        oldProduct.setPrice(product.getPrice());
        oldProduct.setImage(product.getImage());
        oldProduct.setCategory(product.getCategory());
        oldProduct.setRating(product.getRating());
        return productRepository.save(oldProduct);
    }
}
