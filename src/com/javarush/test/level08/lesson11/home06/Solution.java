package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("sina1", "male", 16);
        Human child2 = new Human("sina2", "male", 14);
        Human child3 = new Human("sina3", "male", 12);
        Human mom = new Human("Olga", "female", 34, child1, child2, child3);
        Human dad = new Human("Valera", "male", 36, child1, child2, child3);
        Human gpa1 = new Human("Oleg", "male", 66, mom);
        Human gpa2 = new Human("Misha", "male", 63, dad);
        Human gma1 = new Human("Nadya", "female", 76, mom);
        Human gma2 = new Human("Vera", "female", 74, dad);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(gpa1);
        System.out.println(gpa2);
        System.out.println(gma1);
        System.out.println(gma2);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, String sex, int age, Human child1, Human child2, Human child3)
        {
            this.name = name;
            this.sex = sex.equals("male");
            this.age = age;
            this.children = new ArrayList<>();
            children.add(child1);
            children.add(child2);
            children.add(child3);
        }

        public Human(String name, String sex, int age, Human child1)
        {
            this.name = name;
            this.sex = ("male" == sex);
            this.age = age;
            this.children = new ArrayList<>();
            children.add(child1);
        }
        public Human(String name, String sex, int age)
        {
            this.name = name;
            this.sex = ("male" == sex);
            this.age = age;
            this.children = new ArrayList<>();
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
