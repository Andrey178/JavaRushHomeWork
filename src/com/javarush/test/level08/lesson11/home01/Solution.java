package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. пункт 3
        int udalit = 1;
        int udaleno = 0;
        Iterator<Cat> itr = cats.iterator();
        while (itr.hasNext())
        {
            itr.next();
            if (udaleno < udalit)
            {
                itr.remove();
                udaleno++;
            }// else break;

        }

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());

        return cat;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        for (Cat cat : cats)
        {
            System.out.println(cat);
        }
    }

    // пункт 1
    public static class Cat
    {
//        String name;
//
//        Cat(String name)
//        {
//            this.name = name;
//        }
//        public String getName()
//        {
//            return this.name;
//        }
//        public  String toString()
//        {
//            return  "4";
//        }
    }
}
