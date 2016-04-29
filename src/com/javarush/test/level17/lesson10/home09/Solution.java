package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.*;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
//        Scanner sc = new Scanner(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String firstfilename = sc.nextLine();
//        String secondfilename = sc.nextLine();
        String secondfilename = null;
        String firstfilename = null;
//        File firstfilepath = new File(firstfilename);
//        File secondfilepath = new File(secondfilename);
        try
        {
            firstfilename = reader.readLine();
            secondfilename = reader.readLine();
            reader.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            File firstfilepath = new File(firstfilename);
            File secondfilepath = new File(secondfilename);
            reader = new BufferedReader(new FileReader(firstfilepath));
            String line;
            while ((line = reader.readLine()) != null)
            {
                allLines.add(line);
            }
            reader.close();

            reader = new BufferedReader(new FileReader(secondfilepath));
            while ((line = reader.readLine()) != null)
            {
                forRemoveLines.add(line);
            }
            reader.close();
            Solution sol = new Solution();
            sol.joinData();
        } catch (CorruptedDataException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }


       /* try
        {
            joinData();
        }
        catch (CorruptedDataException e)
        {
            System.out.println("Не все строки присутствуют");
        }*/
        // ПРосто напечатать строки
/*        for (String s : allLines)
        {
            System.out.print(s);
        }
        System.out.println();
        for (String s : forRemoveLines)
        {
            System.out.print(s);
        }*/
    }

    public void joinData() throws CorruptedDataException {
        List<String> poluchilmassiv = new ArrayList<>(allLines);
        System.out.println(poluchilmassiv.toString());
        if(poluchilmassiv.containsAll(forRemoveLines)) {
            poluchilmassiv.removeAll(forRemoveLines);
            allLines = poluchilmassiv;
        } else {
            poluchilmassiv.clear();
            allLines = poluchilmassiv;
            throw  new CorruptedDataException();
        }

    }
}
