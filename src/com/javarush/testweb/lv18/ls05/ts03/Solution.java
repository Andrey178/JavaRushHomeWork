package com.javarush.testweb.lv18.ls05.ts03;

/**
 * Created by Admin on 03.02.2017.
 */
/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String[] filelist = new String[3];
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

        writefile.write(sourcefilebuffer, 0, bufferlength-bufferlength/2);
        writefile.close();
//        System.out.printf("Записал файл 1 %d байт %n", bufferlength-bufferlength/2);

        writefile = new BufferedOutputStream(new FileOutputStream(filelist[2]));
        writefile.write(sourcefilebuffer, bufferlength-bufferlength/2, bufferlength/2);
        writefile.close();
//        System.out.printf("Записал файл 2 %d байт %n", bufferlength/2);
        in.close();
    }
}

