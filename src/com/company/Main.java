package com.company;

import jdk.jfr.Label;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car bmw = new Bmw("bmw",12345,500000);

        Car toyota = new Toyota("toyota",200003,"black");

        Car lexus = new lexus("lexus", 234, 10000);
       Car[] cars ={bmw,toyota,lexus};
        for (Car car1 : cars) {
            if(car1 instanceof Bmw){
                System.out.println(car1);
                ((Bmw) car1).getFaster();
                car1.drive();
            }


        if(car1 instanceof Toyota){
            System.out.println(car1);
            car1.drive();
        }
        if(car1 instanceof lexus){
            System.out.println(car1);
            ((lexus) car1).eat();
            car1.drive();
        }

        }
        }


    }
