package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @Autowired


    @GetMapping("api/product")
    //Teacher between <> is a dataType and can be a class
    public List<Product> getProduct() {


        return productService.getproduct();//getteacher method return list of teacher
    }

    @PostMapping("api/product/add")
    //RequestBody take exact information I need (just body) and  save it into teacher

    public void registerNewProduct(@RequestBody Product product){
        productService.addNewProduct(product);


    }
}
