package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buffer.readLine());
        int b = Integer.parseInt(buffer.readLine());
        int c = Integer.parseInt(buffer.readLine());
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }else if (b < a && b < c) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }else if (c < a && c < b) {
            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
