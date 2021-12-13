package com.example.demosql.model.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    @Autowired

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public List<Order> getOrder(){
        return orderRepository.findAll();
    }
    public void addNewOrder(Order order){
        orderRepository.save(order);
    }
    public void deleteOrder(Integer orderId) {
        orderRepository.deleteById(orderId);}

}
