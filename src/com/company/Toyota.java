package com.company;

public class Toyota extends Car{
    private String color;

    public Toyota(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Toyota is so fast");
    }
}
