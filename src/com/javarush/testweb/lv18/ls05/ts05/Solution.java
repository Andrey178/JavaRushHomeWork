package com.javarush.testweb.lv18.ls05.ts05;/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException {

        Scanner in = new Scanner(System.in);
        String filename = null;
        BufferedInputStream buffer = null;
        int filelength = 1000;
        try
        {
            while (true)
            {
                filename = in.nextLine();
                buffer = new BufferedInputStream(new FileInputStream(filename));

                if (filelength > buffer.available())
                {
                    in.close();
                    buffer.close();
                    throw new DownloadException();
                }
            }
        }catch (IOException e)
        {
        }
    }
    public static class DownloadException extends Exception{
    }
}
