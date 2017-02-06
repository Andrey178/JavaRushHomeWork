package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        int amountofsymbols = 0;
        int amountofspaces = 0;
        String filename = args[0];

        BufferedReader buffer = new BufferedReader(new FileReader(filename));
        char charfromfile;
        while (buffer.ready()) {
            charfromfile = (char) buffer.read();
            amountofsymbols++;
            if (String.valueOf(" ").equals(String.valueOf(charfromfile)))
            {
                amountofspaces++;
            }
        }
        System.out.printf("%.2f", (float) amountofspaces/amountofsymbols*100);
        buffer.close();
    }
}