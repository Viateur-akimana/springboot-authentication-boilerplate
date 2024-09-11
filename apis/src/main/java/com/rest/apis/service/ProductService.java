package com.rest.apis.service;

import com.rest.apis.model.Product;
import com.rest.apis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product createProduct(Product product){
        return productRepo.save(product);
    }
    public Optional<Product> getProductById(Long id){
        return productRepo.findById(id);

    }
    public Product updateProduct(Long id,Product productDetails){
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setBrand(productDetails.getBrand());
        product.setPrice(productDetails.getPrice());
        return productRepo.save(product);
    }

    public void deleteProduct(Long id){
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepo.delete(product);
    }
}
