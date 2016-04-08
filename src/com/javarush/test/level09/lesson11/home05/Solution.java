package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = "Мама мыла раму.";
        String s = reader.readLine();
//        System.out.println(s.length());
        ArrayList<Character> glasnie = new ArrayList();
        ArrayList<Character> neglasnie = new ArrayList();
        for (int i = 0; i < s.length(); i++)
        {
            if (isVowel(s.charAt(i)))
            {
                glasnie.add(s.charAt(i));
            } else {
                if (s.charAt(i) == ' ') continue;
                neglasnie.add(s.charAt(i));
            }
        }
        for (Object o : glasnie)
        {
            System.out.print(o + " ");
        }
        System.out.println();
        for (Object o : neglasnie)
        {
            System.out.print(o + " ");
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
