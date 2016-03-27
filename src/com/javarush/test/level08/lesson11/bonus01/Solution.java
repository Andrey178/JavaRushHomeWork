package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getmonth = reader.readLine();
//        String getmonth = "MAY";
        countmonth(getmonth);
    }

    private static void countmonth(String getmonth)
    {
        SimpleDateFormat dateformat = new SimpleDateFormat("MMMM", Locale.US);
        try
        {
            Date date = dateformat.parse(getmonth);
            System.out.println(getmonth + " is " + (date.getMonth() + 1) + " month");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
