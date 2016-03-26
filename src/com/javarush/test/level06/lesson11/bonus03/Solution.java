package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList chisla = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            chisla.add(Integer.parseInt(reader.readLine()));
//            chisla.add(Math.round(Math.random()*100));
        }
        Collections.sort(chisla);

        for (int i = 0; i < chisla.size(); i++) {
            System.out.println(chisla.get(i));
        }
/*
    for (chisla) {
            System.out.println(chisla);
        }
*/
    }
}
