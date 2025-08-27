package com.busra.productservice.api;

import com.busra.productservice.model.Product;
import com.busra.productservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("")
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    @PostMapping("")
    public Product save(@RequestBody Product product){
        return productRepository.save(product);
    }



}
