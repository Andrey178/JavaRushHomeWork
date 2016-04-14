package com.javarush.testweb;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 14.04.2016.
 */
public class lv14ls04ts05
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit"))
        {
            if ("player".equals(key))
            {
                person = new Player();
            } else if ("dancer".equals(key))
            {
                person = new Dancer();
            }
            haveRest(person);
        }
    }

    public static void haveRest(Person person)
    {
        //Add your code here
        if (person instanceof Player)
        {
            Player.play();
        } else if (person instanceof Dancer)
        {
            Dancer.dance();
        }
    }

    interface Person
    {
    }

    static class Player implements Person
    {
        static void play()
        {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person
    {
        static void dance()
        {
            System.out.println("dancing");
        }
    }
}
