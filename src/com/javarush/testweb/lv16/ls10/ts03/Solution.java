package com.javarush.testweb.lv16.ls10.ts03;

/**
 * Created by Admin on 18.04.2016.
 */
/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread test = new TestThread();
        test.start();
        Thread.sleep(500);
        test.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        public TestThread() {

        }
        public void run() {
            try {
                while(!Thread.interrupted()) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
        }
    }
}