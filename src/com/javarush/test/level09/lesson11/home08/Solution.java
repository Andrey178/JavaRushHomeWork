package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] razmer = {5, 2, 4, 7, 0};
        System.out.println(razmer.length);
        for (int i = 0; i < razmer.length; i++)
        {
            int[] massiv = new int[razmer[i]];
            for (int imassiv = 0; imassiv < massiv.length; imassiv++)
                massiv[imassiv] = (int) (Math.random()*100);
//            System.out.println(razmer[i]);
            list.add(massiv);
//            System.out.println(list);
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
