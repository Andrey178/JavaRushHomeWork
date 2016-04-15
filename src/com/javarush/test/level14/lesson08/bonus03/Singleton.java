package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Admin on 15.04.2016.
 */
public class Singleton
{
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance()
    {
        return ourInstance;
    }
    public static Singleton getInstance(Object o)
    {
        return getInstance();
    }

    private Singleton()
    {

    }
}
