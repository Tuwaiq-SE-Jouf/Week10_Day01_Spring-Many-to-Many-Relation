package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepositry productRepositry;

    @Autowired     //create obj when we need *must be her*
    public ProductService(ProductRepositry productRepositry) {
        this.productRepositry = productRepositry;
    }


    public List<Product> getproduct() {
        return productRepositry.findAll();

    }
    public void addNewProduct(Product product){
        productRepositry.save(product);
    }


}
