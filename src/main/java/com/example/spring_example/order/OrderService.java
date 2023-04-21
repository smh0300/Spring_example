package com.example.spring_example.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
