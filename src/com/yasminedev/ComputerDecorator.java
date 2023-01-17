package com.yasminedev;

abstract class ComputerDecorator implements Computer {
    protected Computer computer;

    public ComputerDecorator(Computer computer){
       this.computer = computer;
    }

    public String getDescription(){
           return computer.getDescription();
    }

    public double getPrice(){
        return computer.getPrice();
    }

    public String getOrderID(){
        return computer.getOrderID();
    }

}





