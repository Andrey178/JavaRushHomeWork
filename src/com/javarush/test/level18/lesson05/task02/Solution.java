package com.javarush.test.level18.lesson05.task02;

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
//        System.out.println("Введите имя файла:");
        String filename = in.nextLine();
//        FileInputStream file = new FileInputStream(filename);
//        BufferedInputStream bufferread = new BufferedInputStream(file);
//        InputStreamReader filestream = new InputStreamReader(file);
//        BufferedReader bufferread = new BufferedReader(filestream);
        int sum = 0;
//        String searchsymbol = ",";
//        char charsymbol = searchsymbol.charAt(0);
        FileReader reader = new FileReader(filename);
        int symbol;
        while (reader.ready()) {
            symbol = reader.read();
//            System.out.print((char) symbol);
//            if (charsymbol == ((char) symbol)) {
            if (symbol == 44) {
//                System.out.print("нашел");
                sum++;
            }
        }
        reader.close();
//        System.out.println(charsymbol);
//        Byte bytes = Byte.decode(searchsymbol);
//        while (file.available() > 0) {
//        while (bufferread.ready()) {
//            symbol = file.read();
//            if (searchsymbol == byteread) sum++;
//            System.out.print(String.valueOf((char) byteread) + " ");
//            System.out.print((char)byteread);
//            if (charsymbol == (char) byteread){
//                sum++;
//            }
//        }
        System.out.print(sum);
        in.close();
//        file.close();
    }
}
