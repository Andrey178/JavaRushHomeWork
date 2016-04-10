package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private String middlename;
        private String familyname;
        private int age;
        private int weight;
        private boolean sex;
//1
        public Human()
        {
            this.name = "Ivan";
            this.middlename = "Ivanovich";
            this.familyname = "Ivanov";
            this.age = 18;
            this.weight = 60;
            this.sex = true;
        }
//2
        public Human(String name, String middlename, String familyname, int age, int weight, String sex)
        {
            this.name = name;
            this.middlename = middlename;
            this.familyname = familyname;
            this.age = age;
            this.weight = weight;
            this.sex = (sex.equals("male"));
        }
//3
        public Human(String name, String middlename, String familyname, int age, int weight)
        {
            this(name, middlename, familyname, age, weight, "male");
        }
//4
        public Human(String name, String middlename, String familyname, int age)
        {
            this(name, middlename, familyname, age, 60, "male");
        }
//5
        public Human(String name, String middlename, String familyname)
        {
            this(name, middlename, familyname, 18, 60, "male");
        }
//6
        public Human(String name, String middlename, String familyname, int age, String sex)
        {
            this.name = name;
            this.familyname = familyname;
            this.middlename = middlename;
            this.age = age;
            this.sex = (sex.equals("male"));
        }
//7
        public Human(String name, String familyname, int age, String sex)
        {
            this.name = name;
            this.familyname = familyname;
            this.age = age;
            this.sex = (sex.equals("male"));
        }
//8
        public Human(String name, String familyname, int age)
        {
            this.name = name;
            this.familyname = familyname;
            this.age = age;
        }
//9
        public Human(String name, String familyname)
        {
            this.name = name;
            this.familyname = familyname;
        }
//10
        public Human(String name)
        {
            this.name = name;
        }
    }
}
