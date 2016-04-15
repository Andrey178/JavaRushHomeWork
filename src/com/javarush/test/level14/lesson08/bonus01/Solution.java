package com.javarush.test.level14.lesson08.bonus01;


import java.io.*;
import java.util.*;


/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();
//        int sumofe = 0;

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
//            System.out.println(++sumofe + "\t" + exception);
//            if (sumofe %5 == 0) System.out.println("уже " + sumofe + " e");
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] array = new int[3];
            int i = array[3];

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            ArrayList<Integer> array = new ArrayList<>();
            array.remove(0);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            ArrayList<Integer> array = new ArrayList<>();
            array.add(5);
            array.add(0, new Integer("d"));

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object x[] = new String[3];
            x[0] = 5;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String s = "blabla";
            char c = s.charAt(10);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String s = null;
            int i = s.length();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here
        try
        {
            FileInputStream fis = new FileInputStream("file.txt");

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 3 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            float i = 2 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
/*        try
        {
            Object o = "blabla";
            Integer s = o.getClass().getSimpleName();
            System.out.println(s);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            exceptions.add(new ReflectiveOperationException("popitka proehat3"));
        } catch (Exception e)
        {
            exceptions.add(e);
        }*/
//        exceptions.add(new IOException());
//        exceptions.add(new NullPointerException());
//        exceptions.add(new NumberFormatException());
//        exceptions.add(new NotSerializableException());
//        exceptions.add(new InputMismatchException());


    }
}
