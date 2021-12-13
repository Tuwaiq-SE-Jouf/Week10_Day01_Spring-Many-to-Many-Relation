package com.example.demosql.controller;
import com.example.demosql.model.products.Products;
import com.example.demosql.model.products.ProductsServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/Product")
public class ProductsController {
    private ProductsServise productsServise;

    public ProductsController(ProductsServise productsServise) {
        this.productsServise = productsServise;
    }

    @Autowired



    @GetMapping
    //student between <> is a dataType and can be a class
    public List<Products> getProducts() {


        return productsServise.getProducts();//getStudent method return list of student
    }
    @GetMapping("{productid}") // if i need put in path a variable must but it insid {}
    public Optional<Products> getstudent (@PathVariable(name="productid") Integer productid){
        return productsServise.getProduct(productid);

    }
    @PostMapping(path="add")
    public void registerNewProduct(@RequestBody Products product){
        productsServise.addNewProducts(product);


    }
    @DeleteMapping(path = "delete/{productid}")
    public void deleteProducts(@PathVariable ("productid") Integer productid){

        productsServise.deleteProducts(productid);
    }



}
