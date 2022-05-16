package com.company;

public class lexus extends Car{
    private int speed;

    public lexus(String name, int price, int speed) {
        super(name, price);
        this.speed = speed;
    }
    public void eat(){
        System.out.println("lexus is eating oil");
    }

    @Override
    public void drive() {
        System.out.println("i want to buy Lexus 570");
    }
}
