package com.company;

public class Bmw extends Car{
    private int weight;

    public Bmw(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }
    public void getFaster(){
        System.out.println("bmw is faster than Lexus");
    }

    @Override
    public void drive() {
        System.out.println("BMW is driven");
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
