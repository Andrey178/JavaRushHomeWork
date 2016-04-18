package com.javarush.testweb.lv15.ls04.ts01;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls04ts01

/* Что-то лишнее
1. Программа должна выводить следующее:
Это double
Это Object
Это double
Это Integer
Это double

2 Удалите реализации всех лишних методов
*/

{
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }
//    public static void print(int i) {
//        System.out.println("Это Integer");
//    }
//    public static void print(Short i) {
//        System.out.println("Это Object");
//    }
    public static void print(Object i) {
        System.out.println("Это Object");
    }
    public static void print(double i) {
        System.out.println("Это double");
    }
//    public static void print(Double i) {
//        System.out.println("Это double");
//    }
//    public static void print(float i) {
//        System.out.println("Это Double");
//    }
}
