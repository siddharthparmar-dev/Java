package com.OOPs;

public class FedEx implements IDelivery{

    @Override
    public String delivered(double amount) {
        return "Order Delivered By FedEx" + amount;
    }
}
