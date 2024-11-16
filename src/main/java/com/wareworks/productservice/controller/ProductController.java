package com.wareworks.productservice.controller;


import com.wareworks.productservice.entity.Product;
import com.wareworks.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
   @Autowired
   private ProductRepository productRepository;

   @GetMapping
   public List<Product> getAllProducts() { 
      return productRepository.findAll();

     }

     @PostMapping
     public Product createProduct(@RequestBody Product product) { 
        return productRepository.save(product);
     }   
 }


