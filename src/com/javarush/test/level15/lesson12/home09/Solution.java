package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String gotstring = reader.readLine();
//        String gotstring = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo&obj=20&obj=Test";
        int strokstart = gotstring.indexOf("?");
//        int strokend = gotstring.length();
        gotstring = gotstring.substring(++strokstart);
        String[] parameters = gotstring.split("&");
        String parametername;
        for (String s : parameters)
        {
            strokstart = s.length();
            if (s.contains("=")) strokstart = s.indexOf("=");
            parametername = s.substring(0, strokstart);
            System.out.print(parametername);
            System.out.print(" ");
        }
        System.out.println();
        for (String s : parameters)
        {
//Вот в startsWith вместо contains и была загвозка а еще к obj добавить символ = !!!!!
            if (!s.startsWith("obj=")) continue;

            strokstart = s.length();
            if (s.contains("=")) strokstart = s.indexOf("=");
            parametername = s.substring(++strokstart, s.length());
//            if (parametername.contains(".")) alert(Double.parseDouble(parametername));
//            else alert(parametername);
//            System.out.print(parametername + " ");
            try
            {
                alert(Double.parseDouble(parametername));
            } catch (NumberFormatException e) {alert(parametername);}
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
