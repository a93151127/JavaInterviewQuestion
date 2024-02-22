package com.martin.question5;

public class EqualMain {
    public static void main(String[] args) {
        String Str1 = new String("runoob");
        String Str2 = Str1;
        String Str3 = new String("runoob");
        boolean retVal;

        retVal = Str1.equals( Str2 );
        System.out.println("返回值 = " + retVal );

        retVal = Str1.equals( Str3 );
        System.out.println("返回值 = " + retVal );

        retVal = Str1 == Str3;
        System.out.println("返回值 = " + retVal);

        String s1 = "Hello";              // String 直接创建
        String s2 = "Hello";              // String 直接创建
        String s3 = s1;                   // 相同引用
        String s4 = new String("Hello");  // String 对象创建
        String s5 = new String("Hello");  // String 对象创建

        System.out.println("s1 == s1 : " + (s1 == s1));         // true, 相同引用
        System.out.println("s1 == s2 : " + (s1 == s2));         // true, s1 和 s2 都在公共池中，引用相同
        System.out.println("s1 == s3 : " + (s1 == s3));         // true, s3 与 s1 引用相同
        System.out.println("s1 == s4 : " + (s1 == s4));         // false, 不同引用地址
        System.out.println("s4 == s5 : " + (s4 == s5));         // false, 堆中不同引用地址

        System.out.println("s1.equals(s3) : " + s1.equals(s3));    // true, 相同内容
        System.out.println("s1.equals(s4) : " + s1.equals(s4));    // true, 相同内容
        System.out.println("s1.equals(s5) : " + s4.equals(s5));    // true, 相同内容
    }
}
