package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
//        String s = "d:\\1.txt";
        ArrayList<String> spisokstrok = new ArrayList<>();
        String ss = "";
        while (!"exit".equals(ss))
        {
            ss = reader.readLine();
//            if ("exit".equals(ss)) break;
            spisokstrok.add(ss);
        }

        File file = new File(s);
//        OutputStream writetofile = new FileOutputStream(file);
        FileWriter writetofile = new FileWriter(file);
//        writetofile.write("");
        for (String sizmassiv : spisokstrok)
        {
            writetofile.append(sizmassiv + System.lineSeparator());
        }
/*
        {
            s = reader.readLine();
            if ("exit".equals(s)) break;
            writetofile.append(s + System.getProperty("line.separator"));
//            writetofile.append('\n');
//            writetofile.append('E');
        }
*/
        writetofile.flush();
        writetofile.close();
        reader.close();

    }
}
