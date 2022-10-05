package com.springbook.restconsumer.models;

public class PaymentInfo {
    private String id;
    private double amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "paymentID='" + id + '\'' +
                ", amount=" + amount +
                '}';
    }
}
