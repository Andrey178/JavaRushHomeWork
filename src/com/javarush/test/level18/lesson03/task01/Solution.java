package com.javarush.test.level18.lesson03.task01;

import java.io.FileInputStream;
import java.util.Scanner;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите имя и путь файла: ");

        String filename = in.nextLine();
//        System.out.println(filename);

        FileInputStream reader = new FileInputStream(filename);
        int bigbyte;
        int newbyte;
//        if (reader.available() > 0)
//        {
            bigbyte = reader.read();
//        }
        while (reader.available() > 0) {
           newbyte = reader.read();
           if (newbyte > bigbyte) bigbyte = newbyte;
        }
        System.out.println(bigbyte);
        in.close();
        reader.close();
    }
}
