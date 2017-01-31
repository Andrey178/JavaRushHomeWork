package com.javarush.test.level17.lesson10.bonus01;

import java.text.SimpleDateFormat;
import java.util.*;

import static com.javarush.test.level17.lesson10.bonus01.Sex.MALE;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        //start here - начни тут
        if (args.length == 0) {
//            System.out.println("Тут нечего делать");
            return;
        }

        if ("-c".equals(args[0]) && args.length == 4)
        {
//            System.out.println("увидел команду добавить");
                createperson(args[1], args[2], args[3]);
        } else if ("-u".equals(args[0]) && args.length == 5)
        {
//            System.out.println("увидел команду обновить");
                updperson(Integer.parseInt(args[1]), args[2], args[3], args[4]);
        } else if ("-d".equals(args[0]) && args.length == 2)
        {
//            System.out.println("увидел команду показать");
            delperson(Integer.parseInt(args[1]));
        } else if ("-i".equals(args[0]) && args.length == 2)
        {
//            System.out.println("увидел команду удалить");
            showperson(Integer.parseInt(args[1]));
        }

//        System.out.println(allPeople.size());
//        showperson(1);
//        delperson(1);
//        showperson(2);
//        showperson(2);
//        System.out.println(allPeople.size());

    }

    private static void createperson(String name, String sex, String date) throws Exception
    {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date1 = dateformat.parse(date);
        Person person;
        if ("м".equals(sex))
        {
            person = Person.createMale(name, date1);
        } else if ("ж".equals(sex))
        {
            person = Person.createFemale(name, date1);
        } else return;
        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }

    private static void updperson(int id, String name, String sex, String date) throws Exception
    {
        if (id >= allPeople.size()) return;
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date1 = dateformat.parse(date);
        if ("м".equals(sex))
        {
            allPeople.get(id).setSex(Sex.MALE);
        } else if ("ж".equals(sex)){
            allPeople.get(id).setSex(Sex.FEMALE);
        } else  return;
        allPeople.get(id).setName(name);
        allPeople.get(id).setBirthDay(date1);
    }

    private static void delperson(int id)
    {
//        System.out.println("Щас удалю из базы личность:" + allPeople.get(id).getName() + " " + allPeople.get(id).getSex() + " " + allPeople.get(id).getBirthDay());
        if (id >= allPeople.size())
            return;
            allPeople.get(id).setBirthDay(null);
    }

    private static void showperson(int id)
    {
        if (id >= allPeople.size() ) return;
//        || allPeople.get(id).getBirthDay() == null

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String bd = simpleDateFormat.format(allPeople.get(id).getBirthDay());
        String sex;
        if (allPeople.get(id).getSex() == MALE)
            {
                sex = "м";
            } else
            {
                sex = "ж";
            }
        System.out.println(allPeople.get(id).getName() + " " + sex + " " + bd);
    }

}
