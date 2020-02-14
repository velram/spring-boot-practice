package com.practice.spring.boot.springbootpractice.rest.dto;

/**
 * @author Velmurugan Moorthy
 */

public class Order {

    private String orderId;
    private String deliveryDate;
    private String totalAmount;

    public Order(String orderId, String deliveryDate, String totalAmount) {
        this.orderId = orderId;
        this.deliveryDate = deliveryDate;
        this.totalAmount = totalAmount;
    }

    //Getters & setters section

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
