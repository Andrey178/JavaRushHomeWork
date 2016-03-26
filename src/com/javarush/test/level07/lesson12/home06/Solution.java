package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gpa1 = new Human("Ded1", "male", 86);
        Human gpa2 = new Human("Ded2", "male", 106);
        Human gba1 = new Human("Bab1", "female", 82);
        Human gba2 = new Human("Bab2", "female", 102);
        Human papa = new Human("Papa", "male", 36, gpa1, gba1);
        Human mama = new Human("Mama", "female", 33, gpa2, gba2);
        Human daughter1 = new Human("Аня", "female", 13, papa, mama);
        Human daughter2 = new Human("Катя", "female", 16, papa, mama);
        Human son1 = new Human("Игорь", "male", 6, papa, mama);
//        Human son1 = new Human("Игорь");

        System.out.println(gpa1);
        System.out.println(gpa2);
        System.out.println(gba1);
        System.out.println(gba2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(daughter1);
        System.out.println(daughter2);
        System.out.println(son1);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human (String name, String sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex.equals("male");
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
       Human (String name, String sex, int age)
        {
            this (name, sex, age, null, null);
        }
       Human (String name)
        {
            this.name = name;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
