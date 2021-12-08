package com.geekbrains.lesson2;

import com.geekbrains.lesson2.theory.Flyable;

public class AnotherMainApp {
    // разница между анонимным классом и лямбдой?
    // на 90% да. есть передача данных что то там
    //  а вообще лямбда это передача метода в метод
    // по сути мы зоварачиваем метод в объект и передаем






    /* внутр класс
    *
    * для внутр класса есть правило - внутр имеет доступ к внешнему но не наоборот.
    * Тк. внутр не может существовать без внешнего
    * а внешнему не гарантируют что он будет иметь внутр
    *
    *
    *  * * * * * а если добавить static то станет вложенным.
    * а как станет вложенным то потеряет доступ ко внешнему классу, и все плюшки
    * ТАК КАК вложенным может существовать отдельно от внешнего
    *
    *
    * Локальный Класс - класс объявлен внутри метода
    * */
    class Inner{
        int innerValue;

        public Inner (int innerValue){
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(innerValue);
            System.out.println(outerValue);
            //outerMethod();// can
        }
    }

    int outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
        //System.out.println(innerValue);// cannot
        //innerMethod(); // cannot
        Inner inner = new Inner(10);
    }

    public static void main(String[] args) {
        // innerClass
        Inner inner = new AnotherMainApp().new Inner(11);

        // Локальный Класс
        class Point{
            int x;
            public Point(int x){
                this.x = x;
            }
            public void info(){
                System.out.println(x);
            }
        }
        Point point = new Point(10);


        // перечисления



        // animus Class
        // анонимный класс - без имени

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                //Flyable.super.fly();
            }
        };

        System.out.println(flyable.getClass().getName());
        // ↪ com.geekbrains.lesson2.AnotherMainApp$1

        // как возник класс от интерфейса?
        // а так
//        public class AnotherMainApp$1 implements Flyable{
//            @Override
//            public void fly(){}
//        }
        // создали анонимный класс от абстрактного интерфейс в тот момент когда переопределили метод
        // ТАКЖЕ нас заставят сразу переопределить методы если мы попробуем создать экземпляр абстрактного класса
        // зачем нужно анонимные классы?
        // вот нужно было создать поток а отдельный файл класс для мелочи не делать
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(400);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        // сожмем запись)))
        new Thread(() -> {
            for (int i = 0; i < 30; i++){
                System.out.println(i);
                try {
                    Thread.sleep(400);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

        // Зачем нужны интерфейсы https://javarush.ru/groups/posts/3665-zachem-nuzhnih-interfeysih
        // Интерфейсы в Java  https://javarush.ru/quests/lectures/questsyntaxpro.level17.lecture06
    }
}
