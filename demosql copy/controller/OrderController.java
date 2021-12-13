package com.example.demosql.controller;
import com.example.demosql.model.order.Order;
import com.example.demosql.model.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/order")
public class OrderController {
    private OrderService orderService;
@Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public List <Order>getOrder(){
        return orderService.getOrder();
    }
    @PostMapping(path = "add")
    public void registerNewOrder(@RequestBody Order order){
      orderService.addNewOrder(order);
    }
    @DeleteMapping(path = "delete/{orderId}")
    public void deleteOrder(@PathVariable ("orderId") Integer orderId){
        orderService.deleteOrder(orderId);
    }

}

