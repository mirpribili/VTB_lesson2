package com.geekbrains.lesson2.theory;

public interface Flyable {
    default void fly(){
        System.out.println(3);
    }
    public static final int x = 10;
}
