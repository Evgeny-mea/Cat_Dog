package ru.gb.catch_the_drop;

public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    protected float maxJump ;

    public Animal(String name, int maxRun, int maxSwim, float maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    void move(int dist) {
        if (maxRun >= dist) System.out.println(name + " пробежал " + dist + " метра");
        else System.out.println(name +  " не смог пробежать " + dist + " метра" );
    }
    void swim(int dist) {
        if (maxSwim >= dist) System.out.println(name + " проплыл " + dist + " метра");
        else System.out.println(name + " не смог проплыть " + dist + " метра");
    }
    void jump(int dist) {
        if (maxJump >= dist) System.out.println(name + " прыгнул " + dist + " метра");
        else System.out.println(name + " не смог прыгнуть " + dist + " метра");
    }
}
