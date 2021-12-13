package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private CartRepositry cartRepositry;

    @Autowired     //create obj when we need *must be her*
    public CartService(CartRepositry cartRepositry) {
        this.cartRepositry = cartRepositry;
    }


    public List<Cart> getCart() {
        return cartRepositry.findAll();

    }
    public void addNewCart(Cart cart){
        cartRepositry.save(cart);
    }
}
