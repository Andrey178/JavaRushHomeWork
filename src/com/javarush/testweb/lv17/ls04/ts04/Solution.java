package com.javarush.testweb.lv17.ls04.ts04;

/**
 * Created by Admin on 20.04.2016.
 */
/* Синхронизированный президент
И снова Singleton паттерн - синхронизация в статическом блоке
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
*/

public class Solution {
    public static class OurPresident {
        static {
            synchronized (OurPresident.class) {
                president = new OurPresident();
            }
        }

        private static OurPresident president;

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {
            return president;
        }
    }
}
