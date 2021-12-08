package com.geekbrains.lesson2.homeworck;

public interface Jump {
    default boolean jump(int height) {
        System.out.println("Участник не умеет прыгать");
        return false;
    }
}
