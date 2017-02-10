package com.javarush.testweb.lv18.ls08.ts02;

import java.io.*;

/* Расширяем AmigoOutputStream
Используя шаблон проектирования Wrapper (Decorator) расширьте функциональность AmigoOutputStream
В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
1. Вывести в консоль фразу [Вы действительно хотите закрыть поток? Д/Н]
2. Считайте строку
3. Если считанная строка равна [Д], то закрыть поток
4. Если считанная строка не равна [Д], то не закрывать поток
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream original1;

    public QuestionFileOutputStream(AmigoOutputStream original) {
        original1 = original;
    }

    @Override
    public void close() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        String reply = reader.readLine();
        reader.close();
        if ("Д".equals(reply)) {
            original1.close();
        }
    }

    @Override
    public void write(int b) throws IOException
    {
        original1.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        original1.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        original1.write(b, off, len);
    }

    @Override
    public void flush() throws IOException
    {
        original1.flush();
    }
}

