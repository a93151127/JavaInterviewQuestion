package com.martin.question.characteristic;

public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.printInfo();
        C c = new C();
        c.printInfo();
    }
}
class A{
    void printInfo(){
        System.out.println("hello, I am A.");
    }
}
class B extends A{
    void printInfo(){
        System.out.println("hello, I am B.");
    }
}
class C extends A{
}
