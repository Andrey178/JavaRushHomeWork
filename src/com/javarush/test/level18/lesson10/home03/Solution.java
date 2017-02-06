package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        String filename1, filename2, filename3;
        BufferedReader reader0 = new BufferedReader(new InputStreamReader(System.in));
        filename1 = reader0.readLine();
        filename2 = reader0.readLine();
        filename3 = reader0.readLine();

        BufferedReader reader2 = new BufferedReader(new FileReader(filename2));
        BufferedReader reader3 = new BufferedReader(new FileReader(filename3));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(filename1));
        while (reader2.ready()) {
            writer1.write(reader2.read());
        }
        while (reader3.ready()) {
            writer1.write(reader3.read());
        }
        reader0.close();
        reader2.close();
        reader3.close();
        writer1.close();
    }
}
