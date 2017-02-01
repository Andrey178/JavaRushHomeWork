package com.javarush.test.level18.lesson03.task05;

import java.io.FileInputStream;
import java.util.*;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//        System.out.println("Введите имя и путь файла: ");  //закоментить
//        String filename = "D:/1.txt";
//        System.out.println(filename);
        String filename = in.nextLine();
        FileInputStream reader = new FileInputStream(filename);

        int highpopularity = 1;

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        while (reader.available() > 0) {
            int bigbyte = reader.read();
            Integer frequency = hashMap.get(bigbyte);
            hashMap.put(bigbyte, frequency == null? 1 : ++frequency);
            if (frequency != null && frequency > highpopularity) highpopularity = frequency;
        }
//        highpopularity = 1;
//        int lowpopularity = highpopularity;
//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
//        {
//            if (entry.getValue() < lowpopularity) {
//                lowpopularity = entry.getValue();
//            }
//        }
        String result = "";
//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
//        {
//            if (entry.getValue() == lowpopularity) {
//                result += entry.getKey() + " ";
//            }
//        }
//        System.out.print(result.trim());

        TreeSet<Integer> list = new TreeSet<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet())
        {
            list.add(entry.getKey());
//            System.out.print(entry.getKey());
            }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            result += iterator.next() + " ";
        }
        System.out.println(result.trim());

        in.close();
        reader.close();
    }
}