package com.dhir.atsecom.controller;

import com.dhir.atsecom.entity.Product;
import com.dhir.atsecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProducts")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

//    @PostMapping("/addProducts")
//    public List<Product> getAllProducts(@RequestBody Product productList) {
//        return productService.saveAll(productList);
//    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/products/title/{title}")
    public Product findProductByTitle(@PathVariable String title) {
        return productService.getProductByTitle(title);
    }

    @GetMapping("/products/category/{category}")
    public List<Product> findProductByCategory(@PathVariable String category) {
        return productService.getProducts();
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductById(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
