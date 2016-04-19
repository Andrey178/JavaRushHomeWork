package com.javarush.test.level16.lesson13.home10;

import java.io.*;

/* Последовательный вывод файлов
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.
Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        }
        catch (IOException e)
        {
        }
//        firstFileName = "1.txt";
//        secondFileName = "2.txt";
//        System.out.println("imena schital");
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);

    }
    public static class ReadFileThread extends Thread implements ReadFileInterface
    {
        private String fullfilename;
        private String fullfilecontent = "";

        public ReadFileThread()
        {
        }

        @Override
        public void run()
        {
//            System.out.println("I work");
//            fullfilecontent = fullfilename;
//            Изменено BufferReader и FileReader в теле на в скобках;
//            поток сам по-идее закрывается (строка 71, 72 не нужны);
            try (BufferedReader filereader = new BufferedReader(new FileReader(new File (fullfilename))))
            {
//                FileReader getfullfilecontent = new FileReader(fullfilename);
//                BufferedReader filereader = new BufferedReader(getfullfilecontent);
                String goteverything = "";
                while ((goteverything = filereader.readLine()) != null) {

                    fullfilecontent = fullfilecontent.concat(goteverything);
                    fullfilecontent = fullfilecontent.concat(" ");
                }
//                filereader.close();
//                getfullfilecontent.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
//            System.out.println(fullfilecontent + " run");;
        }

        @Override
        public void setFileName(String fullFileName)
        {
            this.fullfilename = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            return fullfilecontent;
        }
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public static interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
}
