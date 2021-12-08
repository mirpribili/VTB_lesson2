package com.geekbrains.lesson2.homeworck;

public class Robot implements Contestant{
    private int maxRunDistance;
    private int maxJumpHeight;
    public Robot(){
        this.maxJumpHeight = 20;
        this.maxRunDistance = 400;
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
        return "Robot";
    }
}
