package com.javarush.test.level18.lesson08.task03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream
{
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream filestream;
    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));

    }

    public AmigoOutputStream(FileOutputStream filestream) throws FileNotFoundException
    {
        super(fileName);
        this.filestream = filestream;
    }

    @Override
    public void close() throws IOException {
        filestream.flush();
        String laststring = "JavaRush © 2012-2013 All rights reserved.";
        filestream.write(laststring.getBytes());
        filestream.close();
}
    public  void write(int b) throws IOException
    {
        filestream.write(b);
    }
    public  void write(byte[] b) throws IOException {
        filestream.write(b);
    }
    public  void write(byte[] b, int c, int d) throws IOException {
        filestream.write(b, c, d);
    }
    public  void flush() throws IOException {
        filestream.flush();
    }
    protected void  finalize() throws IOException
    {
        super.finalize();
    }
}
