package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String symbols = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
         int amountofsymbols = 0;
        String filename = args[0];

        BufferedReader buffer = new BufferedReader(new FileReader(filename));
        char charfromfile;
        while (buffer.ready()) {
            charfromfile = (char) buffer.read();
            if (symbols.contains(String.valueOf(charfromfile)))
            {
                amountofsymbols++;
            }
        }
        System.out.println(amountofsymbols);
        buffer.close();
    }
}
