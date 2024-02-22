package com.martin.question9;

public class TestSingletonMain {
    public static void main(String[] args) {
        /*
        // 單執行緒的時候，s1與s2確實為同一個物件
        Singleton s1  =  Singleton.getInstance();
        Singleton s2  =  Singleton.getInstance();
        System.out.println("s1:"+s1.hashCode() + " s2:" + s2.hashCode());
        System.out.println();
        */

        // 兩個執行緒同時執行
        Thread t1 = new SingletonTest("執行緒T1"); // 產生Thread物件
        Thread t2 = new SingletonTest("執行緒T2"); // 產生Thread物件
        t1.start(); // 開始執行t1.run()
        t2.start();
    }
}

class SingletonTest extends Thread{
    String myId;

    public SingletonTest(String id){
        this.myId = id;
    }

    public void run(){
        Singleton singleton = Singleton.getInstance();
        if(singleton != null){
            // 用hashCode判斷前後兩次取到的Singleton物件是否為同一個
            System.out.println(myId+"產生 Singleton:" + singleton.hashCode());
        }
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton(){
        // 這裡面跑很了多code，建立物件需要花費很多資源
    }

    public static Singleton getInstance(){
        // 第一次被呼叫的時候再建立物件

        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}