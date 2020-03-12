package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * Присваивание инициализации каждого поля отдельно
         */
        Box box1 = new Box();
        box1.depth = 3;
        box1.heith = 4;
        box1.wigth = 5;
        box1.color = BoxColor.GREEN;

        /**
         * Инициализация полей через конструктор
         */
        Box box2 = new Box(3,4,5, BoxColor.RED);

   //     int boxVolume = box1.volume();
     //   System.out.println(boxVolume);
        double boxVolume = box1.flexibleVolume(0.1);
        System.out.println(boxVolume + "  в дм куб");
        System.out.println(box1.color);
//jdsglkha;hglj
        box2.printVolume();
        System.out.println(box2.color);
        System.out.println(box2==box1);

    }
}
