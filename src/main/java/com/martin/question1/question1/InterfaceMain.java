package com.martin.question1.question1;

public class InterfaceMain {
    public static void main(String[] args) {
        A a = new A();
        // Inter1.value = 20; => 此程式碼會編譯錯誤, 因為 interface 的變數會自動設定成 static final
        System.out.println( Inter1.value );  // 以介面名稱存取，因為是static修飾
        System.out.println( Inter2.value );  // 同上
        System.out.println( ((Father)a).value ); // 先把物件a轉型成該父類別，再存取
        System.out.println( a.value );  // 直接以物件存取
    }
}

interface Inter1 {
    int value = 10;
}
interface Inter2 {
    int value = 20;
}
class Father{
    int value = 30;
}
class A extends Father implements Inter1,Inter2{
    int value = 40;
}

interface A1 extends A2, A3{
    void a1();
}

interface A2{
    void a2();
}

interface A3{
    void a3();
}

class AAA implements A1{

    @Override
    public void a1() {

    }

    @Override
    public void a2() {

    }

    @Override
    public void a3() {

    }
}

