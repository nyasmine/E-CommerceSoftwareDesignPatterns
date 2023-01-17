package com.yasminedev;

public class BasicComputer implements Computer{
    private static int idCounter = 1;
    private int id;
    private double price;

    public BasicComputer(){
        this.id = idCounter++;
        this.price = 700;
    }

    @Override
    public String getDescription() {
        return "Default Computer ";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getOrderID() {
        return "OrderId@0" + id;
    }

}
