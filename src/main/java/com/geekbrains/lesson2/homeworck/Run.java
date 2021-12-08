package com.geekbrains.lesson2.homeworck;

public interface Run {
    default boolean run(int distance){
        System.out.println("Участник не умеет бегать");
        return false;
    }
}
