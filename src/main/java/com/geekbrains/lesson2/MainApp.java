package com.geekbrains.lesson2;

import com.geekbrains.lesson2.theory.*;

// interfaces
public class MainApp {
    static class Human{
        private Transport currentTransport;



        public void drive(Transport transport){
            transport.start();
            this.currentTransport = transport;
        }

        public void stop(){
            if (currentTransport != null){
                currentTransport.stop();
                currentTransport = null;
            }else{
                System.out.println("А я никуда и не еду.");
            }
        }

        public void skateBoardParkActions(){
            if(!(currentTransport instanceof Skateboard)){
                System.out.println("К сожалению я не взял секейтборд");
                return;
            }
            Skateboard skateboard = (Skateboard) currentTransport;
            //skateboard.makeTrick();
        }
        /* BAD PRACTICE
        public void drive(Car car){
            car.run();
        }
        public void drive(Skateboard skateboard){
            skateboard.runSkate();
        }
        public void drive(Bicycle bicycle){
            bicycle.running();
        }
         */
    }


    static class Car implements Transport {
        @Override
        public void start() {
            System.out.println("Машина поехала");
        }

        @Override
        public void stop() {
            System.out.println("Машина остановилась");
        }
    }
    static class Skateboard implements Transport{

        @Override
        public void start() {
            System.out.println("Скейт поехала");
        }

        @Override
        public void stop() {
            System.out.println("Скейт остановился");
        }
    }
    static class Bicycle implements Transport{

        @Override
        public void start() {
            System.out.println("Велосипед поехал");
        }

        @Override
        public void stop() {
            System.out.println("Велосипед остановился");
        }
    }

    static class Moto implements Transport{
        @Override
        public void start() {
            System.out.println("Мотоцикл поехал");
        }

        @Override
        public void stop() {
            System.out.println("Мотоцикл остановился");
        }
    }

    /* ****************************** */
    public static void main(String[] args) {
        Transport transport = new Moto();
        Human human = new Human();
        human.stop();
        human.drive(transport);
        human.stop();



        /* ****************************** */
        Flyable[] flyables = {
                new Duck(),
                new Airplane(),
        };
        for (Flyable f : flyables){
            f.fly();
        }
        Flyable somethingFlyable = new Duck();
        ((Duck)somethingFlyable).swim();

    }
}
