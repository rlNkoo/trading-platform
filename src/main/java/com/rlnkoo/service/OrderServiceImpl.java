package com.rlnkoo.service;

import com.rlnkoo.domain.OrderType;
import com.rlnkoo.model.Coin;
import com.rlnkoo.model.Order;
import com.rlnkoo.model.OrderItem;
import com.rlnkoo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    
    @Override
    public Order createOrder(User user, OrderItem orderItem, OrderType orderType) {
        return null;
    }

    @Override
    public Order getOrderById(Long orderId) {
        return null;
    }

    @Override
    public List<Order> getAllOrdersOfUser(Long userId, OrderType orderType, String assetSymbol) {
        return List.of();
    }

    @Override
    public Order processOrder(Coin coin, double quantity, OrderType orderType, User user) {
        return null;
    }
}
