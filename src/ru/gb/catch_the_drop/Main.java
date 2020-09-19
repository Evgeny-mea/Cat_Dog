package ru.gb.catch_the_drop;

public class Main {

    public static void main (String[]args){
        Cat c = new Cat("Барсик",200,0,2);
        Dog d = new Dog("Тузик",500,10,0.5f);
        Dog d2 = new Dog("Шарик",500,10, 0.5f);

        System.out.println(c.name);
        c.jump(2);
        c.swim(53);
        c.move(340);

        System.out.println(d.name);
        d.jump(0,4f);
        d.swim(3);
        d.move(650);

        System.out.println(d2.name);
        d2.jump(1);
        d2.swim(3);
        d2.move(300);


//        c.floats();
//        d.floats();
//        d2.floats();
//        System.out.println(" ");
//        c.jump();
//        d.jump();
//        d2.jump();
//        System.out.println(" ");
//        c.voice();
//        d.voice();
//        d2.voice();
  }
//    private static void typecastExample() {
//        //typecast
//        byte b = 100;
//        int i = 511;
//        byte b0 = (byte) i;
//        System.out.println(b0);
}



