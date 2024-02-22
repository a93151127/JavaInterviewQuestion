package com.martin.question11;

public class PrincipleMain {
    public static void main(String[] args) {

    }
}

interface InterfaceMethod {
    void PubMethod();

    default void DefaultMethod() {
        System.out.println("使用default修飾");
    }

    static void StaticMethod() {
        System.out.println("使用static修飾");
    }
}

class InterfaceMethodImpl implements InterfaceMethod {
    @Override
    public void PubMethod() {
        System.out.println("public方法");
    }
}