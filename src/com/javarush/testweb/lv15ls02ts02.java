package com.javarush.testweb;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls02ts02
{
    //добавьте классы Goose и Dragon тут
    public static class Goose extends SmallAnimal {
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }
    public static class Dragon extends BigAnimal {
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
