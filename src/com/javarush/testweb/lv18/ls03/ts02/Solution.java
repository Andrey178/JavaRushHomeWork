package com.javarush.testweb.lv18.ls03.ts02;

import java.io.FileInputStream;
import java.util.Scanner;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
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
            if (newbyte < bigbyte) bigbyte = newbyte;
        }
        System.out.println(bigbyte);
        in.close();
        reader.close();
    }
}