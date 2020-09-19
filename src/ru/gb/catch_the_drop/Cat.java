package ru.gb.catch_the_drop;

public class Cat extends Animal {
    Cat(String name, int maxRun, int maxSwim, float maxJump){
        super(name, maxRun = 200, maxSwim, maxJump = 2);
    }

    @Override
    void swim (int dist) {
        System.out.println(name + " отказался плавать");
    }
}