package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите имя и путь файла: ");  //закоментить
//        String filename = "D:/1.txt";
//        System.out.println(filename);
        String filename = in.nextLine();
        FileInputStream reader = new FileInputStream(filename);

        int highpopularity = 0;

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        while (reader.available() > 0) {
            int bigbyte = reader.read();
            Integer frequency = hashMap.get(bigbyte);
            hashMap.put(bigbyte, frequency == null? 1 : ++frequency);
            if (frequency != null && frequency > highpopularity) highpopularity = frequency;
        }
//        highpopularity = 1;
        String result = "";
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
        {
            if (entry.getValue() == highpopularity) {
                result += entry.getKey() + " ";
            }
        }
        System.out.print(result.trim());

        in.close();
        reader.close();
    }
}
