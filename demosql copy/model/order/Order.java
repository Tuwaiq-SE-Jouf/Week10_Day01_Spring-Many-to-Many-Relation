package com.example.demosql.model.order;

import javax.persistence.*;

import com.example.demosql.model.products.Products;

import java.util.List;
import java.util.ArrayList;

@Entity
@Table (name = "orders")
public class Order {
    @Id
    private int order_id;

@ManyToMany(mappedBy = "or")
private List<Products> list = new ArrayList<>();

    public Order(int order_id, List<Products> list) {
        this.order_id = order_id;
        this.list = list;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Products> getList() {
        return list;
    }

    public void setList(List<Products> list) {
        this.list = list;
    }

    public Order() {
    }
}