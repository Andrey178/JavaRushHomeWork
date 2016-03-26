package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = "мама  мыла раму";
        String s = reader.readLine();
        System.out.println(szaglav(s));

        //напишите тут ваш код
    }

    private static String szaglav(String s)
    {
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++)
        {
//            System.out.println(strings[i]);
            if (strings[i].length() <= 1)
            {
                strings[i] = strings[i].substring(0).toUpperCase();

            } else
            {
                String fsimbol = strings[i].substring(0, 1).toUpperCase();
                String othersimbols = strings[i].substring(1);
                strings[i] = fsimbol.concat(othersimbols);
            }
        }
        String strokivmeste = strings[0];
        for (int ii = 1; ii < strings.length; ii++)
        {
            strokivmeste = strokivmeste.concat(" ").concat(strings[ii]);
        }
        return strokivmeste;
    }


}
