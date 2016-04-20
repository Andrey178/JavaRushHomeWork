package com.javarush.testweb.lv17.ls04.ts05;

/**
 * Created by Admin on 20.04.2016.
 */
/* МВФ
Singleton паттерн - синхронизация в методе
IMF - это Международный Валютный Фонд
Внутри метода getFund создайте синхронизированный блок
Внутри синхронизированного блока инициализируйте переменную imf так, чтобы метод getFund всегда возвращал один и тот же объект
*/

public class Solution {
    public static class IMF {

        private static IMF imf;

        public static IMF getFund() {
            //add your code here - добавь код тут
            synchronized (IMF.class) {
                return imf;
            }
        }

        private IMF() {
        }
    }
}
