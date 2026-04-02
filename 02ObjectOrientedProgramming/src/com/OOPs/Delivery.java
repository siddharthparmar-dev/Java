package com.OOPs;

public class Delivery {
    private IDelivery delivery;

//    public void setDelivery(IDelivery delivery) {
//        this.delivery = delivery;
//    }

    public Delivery(IDelivery delivery){
        this.delivery = delivery;
    }
    public Delivery(){

    }

    public void TotalAmount(double amount){
        System.out.println(delivery.delivered(amount));
        double deliveryCharge = 40.0;
        System.out.println("Total amount : " + (amount + deliveryCharge));
    }
}
