package com.rlnkoo.service;

import com.rlnkoo.domain.OrderType;
import com.rlnkoo.model.Coin;
import com.rlnkoo.model.Order;
import com.rlnkoo.model.OrderItem;
import com.rlnkoo.model.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId) throws Exception;

    List<Order> getAllOrdersOfUser(Long userId, OrderType orderType, String assetSymbol);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;
}
