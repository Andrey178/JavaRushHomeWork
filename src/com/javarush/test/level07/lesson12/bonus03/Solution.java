package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        Arrays.sort(array);
        int length = array.length;
        int[] temp = new int[length];
        System.arraycopy(array, 0, temp, 0, length);
 //       temp.clone(array);
//        int ii = 0;
//        for (int i: array)
//        {
//        temp[ii++] = i;
//        }

//        for (int i = 0; i < length; i++)
//        {
//            temp[i] = array[length - i - 1];
//        }
        for (int i = 0; i < length; i++)
        {
            array[i] = temp[length - i - 1];

        }
        System.out.println(temp[0] + " " + temp[temp.length - 1]);


    }
}

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
