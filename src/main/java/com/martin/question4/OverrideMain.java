package com.martin.question4;

public class OverrideMain {
    public static void main(String[] args) {
        Dog b = new Dog(); // Dog 对象

        b.move();//执行 Dog 类的方法
    }
}

class Animal{

    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{

    public void move(){
        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }
}