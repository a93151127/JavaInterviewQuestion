package com.martin.question.characteristic;

public class Encapusulation {
    public static void main(String[] args) {
        ATM a = new ATM("Martin", 123456);
        System.out.println("餘額 : " + a.getBalance() + "元");
    }
}

class ATM{
    private String name;
    private long passWord;
    private long balance;

    public ATM(String name, long passWord) {
        this.name = name;
        this.passWord = passWord;
        this.balance = 10000;
    }

    public long getBalance() {
        // 查詢餘額
        return balance;
    }
}