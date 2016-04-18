package com.javarush.testweb.lv16.ls05.ts03;

/**
 * Created by Admin on 17.04.2016.
 */
/* Продвижение на политических дебатах
1. Разберитесь, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
*/

public class Solution {
    public static int totalCountSpeeches = 200;
//    public static int totalCountSpeeches = 20;
    public static int soundsInOneSpeech = 1000000;
//    public static int soundsInOneSpeech = 10;

    public static void main(String[] args) throws InterruptedException {
        Politic ivanov = new Politic("Иванов");
        Politic petrov = new Politic("Петров");
        Politic sidorov = new Politic("Сидоров");
        ivanov.join();
//        Thread.sleep(1000);

        while (ivanov.getCountSpeaches() + petrov.getCountSpeaches() + sidorov.getCountSpeaches() < totalCountSpeeches) {
//            Thread.yield();
        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politic extends Thread {
        private int countSounds;

        public Politic(String name) {
            super(name);
            start();
        }

        public void run() {
              while (countSounds < totalCountSpeeches * soundsInOneSpeech) {
                countSounds++;
            }
        }

        public int getCountSpeaches() {
            return countSounds / soundsInOneSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeaches());
        }
    }
}

