package com.javarush.testweb.lv15.ls09.ts03;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls09ts03
/* Статики 3
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar с типом int
doubleVar с типом double
DoubleVar с типом Double
booleanVar с типом boolean
ObjectVar с типом Object
ExceptionVar с типом Exception
StringVar с типом String
2. В методе main вывести их значения в заданном порядке.
*/
{
        static int intVar;
        static double doubleVar;
        static Double DoubleVar;
        static boolean booleanVar;
        static Object ObjectVar;
        static Exception ExceptionVar;
        static String StringVar;

    public static void main(String[] args) {
        System.out.println(intVar);
        System.out.println(doubleVar);
        System.out.println(DoubleVar);
        System.out.println(booleanVar);
        System.out.println(ObjectVar);
        System.out.println(ExceptionVar);
        System.out.println(StringVar);
    }
}
