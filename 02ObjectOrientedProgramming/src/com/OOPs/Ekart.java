package com.OOPs;

public class Ekart implements IDelivery{

    @Override
    public String delivered(double amount) {

        return "Order Delivered By Ekart" + amount;
    }
}
