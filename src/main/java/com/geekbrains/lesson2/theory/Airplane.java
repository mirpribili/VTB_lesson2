package com.geekbrains.lesson2.theory;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        //Flyable.super.fly();
        System.out.println("Самолет летит");
    }
}
