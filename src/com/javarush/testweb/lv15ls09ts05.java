package com.javarush.testweb;

/**
 * Created by Admin on 16.04.2016.
 */
public class lv15ls09ts05
/* Статики 4
Внутри статического блока:
1. Создайте класс Cat
2. Внутри Cat создайте поле класса String name = "Пушок"
3. Создайте объект класса Cat - myCat
4. Присвойте статическому объекту Object cat объект, созданный в п.3
5. Выведите в консоль myCat.name
*/

 {
    public static Object cat;
    static
    {
        class Cat
        {
            String name = "Пушок";

        }

        Cat myCat = new Cat();
        cat = myCat;
        System.out.println(myCat.name);
    }
}

