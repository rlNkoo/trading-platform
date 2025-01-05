package com.rlnkoo.request;

import com.rlnkoo.domain.OrderType;
import lombok.Data;

@Data
public class CreateOrderRequest {

    private String coinId;

    private double quantity;

    private OrderType orderType;
}
