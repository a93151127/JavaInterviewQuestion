package com.martin.question1.question1.abstractCase;

public class AbstractCaseMain {
    public static void main(String[] args) {

    }
}

abstract class Vehicle{
    String brand, type;
    abstract void showInfo();
}
class Car extends Vehicle{

    String brand, type;

    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    @Override
    void showInfo() {
        System.out.println("牌子 : " + this.brand + " 是車子");
    }
}

class AirPlain extends Vehicle{

    String brand, type;

    public AirPlain(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    @Override
    void showInfo() {
        System.out.println("牌子 : " + this.brand + " 是飛機");
    }
}
