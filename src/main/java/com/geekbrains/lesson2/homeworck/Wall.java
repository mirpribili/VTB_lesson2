package com.geekbrains.lesson2.homeworck;

public class Wall implements Obstacle{
    private int length;
    public Wall(int length){
        if(length < 0){
            throw new IllegalArgumentException("Не допустимое значение");
        }
        this.length=length;
    }

    @Override
    public boolean contest(Contestant contestant){
        if (contestant.jump(length)){
            System.out.println(contestant.toString() + " стену перепрыгнул");
            return true;
        } else{
            System.out.println(contestant.toString() + " стену не смог перепрыгнуть");
            return false;
        }
    }
}
