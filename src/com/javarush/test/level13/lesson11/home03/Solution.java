package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
//        String fullfilename = "D:/Project/JavaRushHomeWork/src/com/javarush/test/level13/lesson11/home03/" + filename;
        String fullfilename = filename;
//        String filename = "D:/Project/JavaRushHomeWork/src/com/javarush/test/level13/lesson11/home03/toread.txt";
try
{

    File file = new File(fullfilename);
    InputStream readfile = new FileInputStream(file);
    BufferedInputStream buffer = new BufferedInputStream(readfile);
    // Buffered ускоряет, но можно и без него, напрямую
    DataInputStream databuffer = new DataInputStream(buffer);
    BufferedReader bufferreader = new BufferedReader(new FileReader(file));

//        OutputStream writefile = new FileOutputStream(filename + ".txt");


    while (databuffer.available() > 0)
    {
        System.out.println(databuffer.readLine());

    }
    databuffer.close();
    buffer.close();
    readfile.close();
} catch (IOException e) {
    System.out.println(e);
}
        reader.close();
//        writefile.close();

    }
}
