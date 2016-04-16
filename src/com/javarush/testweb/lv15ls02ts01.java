package com.javarush.testweb;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls02ts01
/* ООП - Расставить интерфейсы
1. Добавить все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
2. Реализовать их методы.
*/

{
    public static interface Movable {
        boolean getAllowedAction(String name);
    }

    public static interface Sellable {
        Object getAllowedAction(String name);
    }

    public static interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Discountable, Sellable {
        public Object getAllowedAction() { return null;}
        public Object getAllowedAction(String name) { return null;}

    }
}
