package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    public static List<Orange> supplyOranges(int size){
        List<Orange> oranges = new ArrayList<>();
        for (int i = 0; i < size; i ++){
            oranges.add(new Orange());
        }
        return oranges;
    }

    public static List<Apple> supplyApples(int size){
        List<Apple> oranges = new ArrayList<>();
        for (int i = 0; i < size; i ++){
            oranges.add(new Apple());
        }
        return oranges;
    }
}
