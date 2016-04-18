package com.javarush.testweb.lv15.ls09.ts04;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls09ts04
/* Статики и исключения
В статическом блоке выбросьте RuntimeException
В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B

Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.test.level15.lesson09.task04.Solution.clinit(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement
*/

{
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
// неправильно       throw new  RuntimeException();
        int B = A / 0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

