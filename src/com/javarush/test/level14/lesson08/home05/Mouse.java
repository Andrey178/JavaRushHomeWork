package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Admin on 15.04.2016.
 */
public class Mouse implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
