package com.OOPs;

public class DTDC implements IDelivery{

    @Override
    public String delivered(double amount) {
        return "Order Delivered By DTDC" + amount;
    }
}
