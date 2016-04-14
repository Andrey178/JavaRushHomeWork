package com.javarush.testweb;

/**
 * Created by Admin on 14.04.2016.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lv14ls04ts02

/* Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.
Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
*/

{
    public static void main(String[] args) throws Exception
    {
        //Add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        while (!(name = reader.readLine()).isEmpty())
        {
            Cat cat = CatFactory.getCatByKey(name);
            if (cat instanceof FemaleCat) {System.out.println((FemaleCat) cat);}
            else if (cat instanceof MaleCat) {System.out.println((MaleCat) cat);}
            else {System.out.println(cat);}

        }
    }

    static class CatFactory
    {

        public static Cat getCatByKey(String key)
        {
            Cat cat = null;
            if ("vaska".equals(key))
            {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key))
            {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key))
            {
                cat = new FemaleCat("Кисюлька");
            } else
            {
                cat = new Cat(key);
            }

            return cat;
        }
    }

    static class Cat
    {
        private String name;

        protected Cat(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return this.name;
        }

        public String toString()
        {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat
    {
        MaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat
    {
        FemaleCat(String name)
        {
            super(name);
        }

        public String toString()
        {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
