package com.javarush.testweb.lv18.ls05.ts04;

import java.io.*;
import java.util.Scanner;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String[] filelist = new String[2];
        for (int i = 0; i < filelist.length; i++)
        {
            if (in.hasNext()) filelist[i] = in.nextLine();
//            filelist[i] = (String.valueOf(i).concat("file.txt"));
//            System.out.println("got file: " + filelist[i]);
        }

        BufferedInputStream readfile = new BufferedInputStream(new FileInputStream(filelist[0]));
        BufferedOutputStream writefile = new BufferedOutputStream(new FileOutputStream(filelist[1]));

        byte[] sourcefilebuffer = new byte[readfile.available()];
        int bufferlength = sourcefilebuffer.length;
//        System.out.println(bufferlength + " " + bufferlength/2);
        readfile.read(sourcefilebuffer, 0, bufferlength);
        readfile.close();

        for (int i = bufferlength-1; i >=0; i--)
        {
            writefile.write(sourcefilebuffer, i, 1);
        }
        writefile.close();
//        System.out.printf("Записал файл 1 %d байт %n", bufferlength-bufferlength/2);

        in.close();
    }
}