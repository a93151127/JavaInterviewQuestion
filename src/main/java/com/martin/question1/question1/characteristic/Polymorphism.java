package com.martin.question1.question1.characteristic;

public class Polymorphism {
    public static void main(String[] args) {
        Animal a =new Animal();
        Animal b =new Dog();
        Animal c =new Bird();
        Animal d =new Fish();

        move(a);
        move(b);
        move(c);
        move(d);
    }

    static void move(Animal animal){
        animal.move();
    }
}

class Animal {
    void move() {
        System.out.println("move...move...");
    }
}
class Dog extends Animal {
    void move() {
        System.out.println("跑...跑...");
    }
}
class Bird extends Animal {
    void move() {
        System.out.println("飛...飛...");
    }
}
class Fish extends Animal {
    void move() {
        System.out.println("游...游...");
    }
}