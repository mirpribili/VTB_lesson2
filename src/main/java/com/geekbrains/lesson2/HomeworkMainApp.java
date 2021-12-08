package com.geekbrains.lesson2;

import com.geekbrains.lesson2.homeworck.*;

import java.util.ArrayList;
import java.util.List;

public class HomeworkMainApp {
    public static void main(String[] args) {
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Treadmill(40));
        obstacles.add(new Wall(2));
        obstacles.add(new Treadmill(200));

        List<Contestant> contestants = new ArrayList<>();
        contestants.add(new Robot());
        contestants.add(new Human());
        contestants.add(new Cat());

        for (Contestant contestant: contestants) {
            for(Obstacle obstacle : obstacles){
                if(!obstacle.contest(contestant))break;
            }
        }
    }
}
 