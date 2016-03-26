package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/*
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);
*/
        String gparentname = reader.readLine();
        Cat grandparent = new Cat(gparentname);
        String gparentname1 = reader.readLine();
        Cat grandparent1 = new Cat(gparentname1);
        String parentname = reader.readLine();
        Cat parent = new Cat(parentname, grandparent, null);
        String parentname1 = reader.readLine();
        Cat parent1 = new Cat(parentname1, null, grandparent1);
        String name = reader.readLine();
        Cat catson = new Cat(name, parent, parent1);
        String name1 = reader.readLine();
        Cat catdaughter = new Cat(name1, parent, parent1);
//        Cat catandfam = new Cat(gparentname, gparentname, parentname, parentname1, name, name1);
//        Cat.printFamTree(catandfam);

        System.out.println(grandparent);
        System.out.println(grandparent1);
        System.out.println(parent);
        System.out.println(parent1);
        System.out.println(catson);
        System.out.println(catdaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent1;

        Cat(String name)
        {
            this(name, null, null);
        }

        Cat(String name, Cat parent)
        {
            this(name, parent, null);
        }
        Cat(String name, Cat parent, Cat parent1)
        {
            this.name = name;
            this.parent = parent;
            this.parent1 = parent1;
        }

        @Override
        public String toString()
        {
            if (parent == null && parent1 == null)
                return "Cat name is " + name + ", no mother" + ", no father";
            else
            if (parent == null && parent1 != null)
                return "Cat name is " + name + ", mother is " + parent1.name + ", no father ";
            else
            if (parent1 == null && parent != null)
                return "Cat name is " + name + ", no mother" + ", father is " + parent.name;
            else
                return "Cat name is " + name + ", mother is " + parent1.name + ", father is " + parent.name;
        }
    }

}

/*

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent)
        {
            this.name = name;
            this.parent = parent;
        }

        @Override
        public String toString()
        {
            if (parent == null)
                return "Cat name is " + name + ", no mother ";
            else
                return "Cat name is " + name + ", mother is " + parent.name;
        }
    }

}
*/
