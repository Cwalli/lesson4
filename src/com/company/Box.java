package com.company;

public class Box {
    int wigth;
    int heith;
    int depth;
    public BoxColor color;

    // Конструктор без параметров
    public Box(){

    }

    // Конструктор с параметрами
    public Box(int wigth, int heith, int depth, BoxColor color) {
        this.wigth = wigth;
        this.heith = heith;
        this.depth = depth;
        this.color = color;
    }
    // Методы
    public int volume() {
        return wigth*heith*depth;
    }
    public double flexibleVolume(double divider) {
        return wigth*divider*heith*divider*depth*divider;
    }
    public void printVolume(){
        int volume = volume();
        System.out.println(volume);

    }
}
