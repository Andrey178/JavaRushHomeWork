package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("MAY 1 2013");
    }

    public static boolean isDateOdd(String date)
    {
        SimpleDateFormat formatdate = new SimpleDateFormat("MMMMM dd yyyy", Locale.US);
        Date currentdate = null;
        try
        {
            currentdate = formatdate.parse(date);
//            System.out.println(currentdate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatdate2 = new SimpleDateFormat("DD");
        String s = formatdate2.format(currentdate);
        int i = Integer.parseInt(s);
        boolean chetnechet = !(i%2 == 0);
//        System.out.println(chetnechet? "нечетное" : "четное");

//        Date currentdate = formatdate.parse("2011-01-18 00:00:00.0");
        return chetnechet;
    }
}
