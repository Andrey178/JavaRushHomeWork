package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
//        String filename = "D:\\1.txt";
        File fullfilename = new File(filename);

        ArrayList<Integer> listchisel = new ArrayList<>();

        BufferedReader bufferreader = new BufferedReader(new FileReader(fullfilename));
        String s;
        while ((s = bufferreader.readLine()) != null)
        {
//            s = bufferreader.readLine();
            listchisel.add(Integer.parseInt(s));
        }
        Collections.sort(listchisel);

        for (Integer frbfr : listchisel)
        {
            if (frbfr % 2 == 0)
            {
                System.out.println(frbfr);
            }
        }
    }
}
