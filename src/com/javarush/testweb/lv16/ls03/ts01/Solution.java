package com.javarush.testweb.lv16.ls03.ts01;

/**
 * Created by Admin on 17.04.2016.
 */

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
    public static class TestThread implements Runnable {
        public void run() {
            System.out.println("My first thread");
        }
    }
}

