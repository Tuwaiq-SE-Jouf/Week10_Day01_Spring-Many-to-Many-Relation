package com.example.demosql.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductsServise {
    private ProductsRepository productsRepository ;


    public ProductsServise(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Autowired     //create obj when we need


    public List<Products> getProducts() {

        return productsRepository.findAll();


    }

    public Optional<Products> getProduct (Integer ProductId){

        return  productsRepository.findById(ProductId);
    }

    public void addNewProducts (Products product){

        productsRepository.save(product);
    }
    public void deleteProducts(Integer ProductId) {
        productsRepository.deleteById(ProductId);
        //boolean exist = studentRepository.existsById(studentId);
        // put a condition on 'exist'. if exist then delete
    }
}


