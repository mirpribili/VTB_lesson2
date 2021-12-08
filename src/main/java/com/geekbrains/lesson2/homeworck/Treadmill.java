package com.geekbrains.lesson2.homeworck;

public class Treadmill implements Obstacle{
    private int length;
    public Treadmill(int length){
        if(length < 0){
            throw new IllegalArgumentException("Не допустимое значение");
        }
        this.length=length;
    }

    @Override
    public boolean contest(Contestant contestant){
        if (contestant.run(length)){
            System.out.println(contestant.toString() + " дистанцию пробежал");
            return true;
        } else{
            System.out.println(contestant.toString() + " дистанцию не смог пробежать");
            return false;
        }
    }
}
