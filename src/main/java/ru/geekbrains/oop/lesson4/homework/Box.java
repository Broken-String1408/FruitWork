package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box<T extends Fruit> {

//    private int size;
    private final List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }
    public Box(List<T> fruits) {
        this.fruits = fruits;
    }

    public void unloadToAnotherBox(Box<T> box) {
        if(this == box) return;
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
    }

    public boolean compare(Box<? extends Fruit> box){
        if(this == box) return true;
        return getWeight() == box.getWeight();
    }
    public float getWeight(){
        if(fruits.isEmpty()) return 0f;
        return fruits.get(0).getWeight() * fruits.size();
    }
    public void printBoxInfo(){
        if(fruits.isEmpty()) System.out.println("Это путой ящик");
        else if (fruits.get(0) instanceof Apple) System.out.printf("В этом ящике яблоки в кол-ве: %s шт.%n", fruits.size());
        else System.out.printf("В этом ящике апельсины в кол-ве: %s шт.%n", fruits.size());
    }
}
