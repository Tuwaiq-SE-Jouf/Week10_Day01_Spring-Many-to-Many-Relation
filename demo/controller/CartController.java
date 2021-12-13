package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.model.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @Autowired


    @GetMapping("api/cart")
    //Teacher between <> is a dataType and can be a class
    public List<Cart> getCart() {


        return cartService.getCart();//getteacher method return list of teacher
    }

    @PostMapping("api/cart/add")
    //RequestBody take exact information I need (just body) and  save it into teacher

    public void registerNewTeacher(@RequestBody Cart cart){
        cartService.addNewCart(cart);


    }
}
