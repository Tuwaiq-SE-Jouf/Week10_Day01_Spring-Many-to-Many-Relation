package com.example.demosql.model.products;


import com.example.demosql.model.order.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table  (name = "Products")
public class Products {
    @Id
    private int Product_id;
    private int price;
    private String image;

     @ManyToMany
     @JoinTable(
        name = "ord",
        joinColumns =  @JoinColumn(name = "Product_id") ,
        inverseJoinColumns = @JoinColumn(name = "order_id") )
       private List<Order> or =new ArrayList<>();

    public Products() {
    }

    public Products(int product_id, int price, String image, List<Order> or) {
        Product_id = product_id;
        this.price = price;
        this.image = image;
        this.or = or;
    }

    public int getProduct_id() {
        return Product_id;
    }

    public void setProduct_id(int product_id) {
        Product_id = product_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Order> getOr() {
        return or;
    }

    public void setOr(List<Order> or) {
        this.or = or;
    }
}