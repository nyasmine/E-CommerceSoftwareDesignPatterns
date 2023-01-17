package com.yasminedev;

class BensPicture extends ComputerDecorator{
    private double price;

    public BensPicture(Computer specialcomputer) {
        super(specialcomputer);
        System.out.println("Adding Ben's Picture");
    }

    public String getDescription(){
        return computer.getDescription() + "+ Ben's Picture ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

class GPU3080Ti extends ComputerDecorator{
    private double price;

    public GPU3080Ti(Computer computer) {
        super(computer);
        System.out.println("Adding GPU 3080 Ti");
    }

    public String getDescription(){
        return computer.getDescription() + "+ GPU 3080 Ti ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}


class Keyboard extends ComputerDecorator{
    private double price;

    public Keyboard(Computer computer) {
        super(computer);
        System.out.println("Adding Keyboard");
    }

    public String getDescription(){
        return computer.getDescription() + "+ Keyboard ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

class Microphone extends ComputerDecorator{
    private double price;

    public Microphone(Computer computer) {
        super(computer);
        System.out.println("Adding Microphone");
    }

    public String getDescription(){
        return computer.getDescription() + "+ Microphone ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}


class Monitor extends ComputerDecorator{
    private double price;

    public Monitor(Computer computer) {
        super(computer);
        System.out.println("Adding Monitor");
    }

    public String getDescription(){
        return computer.getDescription() + "+ Monitor ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

class Mouse extends ComputerDecorator{
    private double price;

    public Mouse(Computer computer) {
        super(computer);
        System.out.println("Adding Mouse");
    }

    public String getDescription(){
        return computer.getDescription() + "+ Mouse ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

class Speaker extends ComputerDecorator{
    private double price;

    public Speaker(Computer computer) {
        super(computer);
        System.out.println("Adding Speaker");
    }

    public String getDescription(){
        return computer.getDescription() + "+ Speaker ";
    }

    public double getPrice(){
        return computer.getPrice() + price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}


class USBHDCamera extends ComputerDecorator{
    private double price;

    public USBHDCamera(Computer computer) {
        super(computer);
        System.out.println("Adding USB HD Camera");
    }

    public String getDescription(){
        return computer.getDescription() + "+ USB HD Camera ";
    }

    public double getPrice(){
        return computer.getPrice()+ price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

