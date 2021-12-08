package com.geekbrains.lesson2.homeworck;

public class Cat implements Contestant{
    private int maxRunDistance;
    private int maxJumpHeight;
    public Cat(){
        this.maxJumpHeight = 1;
        this.maxRunDistance = 100;
    }
    @Override
    public boolean jump(int height) {
        if(height > maxJumpHeight) {
            System.out.println("Высота " + height + " не преодолима для " + this.toString());
            return false;
        }else{
            System.out.println("Высота " + height + " преодолена " + this.toString());
            return true;
        }
    }

    @Override
    public boolean run(int distance) {
        if(distance > maxRunDistance) {
            System.out.println("Расстояние " + distance + " не преодолимо для " + this.toString());
            return false;
        }else{
            System.out.println("Расстояние " + distance + " преодолено " + this.toString());
            return true;
        }
    }

    @Override
    public String toString(){
        return "Cat";
    }
}
