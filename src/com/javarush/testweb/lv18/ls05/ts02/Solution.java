package com.javarush.testweb.lv18.ls05.ts02;

/**
 * Created by Admin on 02.02.2017.
 */
/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();
        int sum = 0;
        FileReader reader = new FileReader(filename);
        int symbol;
        while (reader.ready()) {
            symbol = reader.read();
            if (symbol == 44) {
                sum++;
            }
        }
        reader.close();
        System.out.print(sum);
        in.close();
    }
}
