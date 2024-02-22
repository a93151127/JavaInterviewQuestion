package com.martin.question10;

public class ReflectMain {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方法 1
        PersonReflect p = new PersonReflect();
        Class class1 = p.getClass();
        System.out.println(class1);
        // 方法 2
        Class class2 = PersonReflect.class;
        System.out.println(class2);
        // 方法 3 (透過 路徑 取得一個 Class 的物件)
        Class class3 = Class.forName("com.martin.question10.PersonReflect");
        System.out.println(class3);

    }
}

class PersonReflect {
}