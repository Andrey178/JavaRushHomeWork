package MyOwnTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 20.03.2016.
 */
public class Test4
{
    public static void main(String[] args)
    {
        HashMap<String, String> mapp = createMap();
        System.out.println(getCountTheSameFirstName(mapp, "Ivanv"));
        System.out.println(getCountTheSameLastName(mapp, "Oleg"));
        System.out.println(mapp.size());
        System.out.println(mapp);
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov", "Alex");
        map.put("Petrov", "Mihail");
        map.put("Kozlov", "Oleg");
        map.put("Popov", "Alex");
        map.put("Potrov", "Mihail");
        map.put("Kislov", "Oleg");
        map.put("Ifanov", "Aleg");
        map.put("Petron", "Migel");
        map.put("Kosulov", "Sneg");
        map.put("Glebov", "Sasha");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int bingo = 0;
//        for (String key : map.keySet())
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (name.equals(pair.getKey())) bingo++;
//            if (name.equals(map.get(key))) bingo++;
        }
//        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
//        while (itr.hasNext())
//        {
//            if (name.equals(itr.getKey())) bingo++;
//        }
        return bingo;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int bingo = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (lastName.equals(pair.getValue())) bingo++;
        }
        return bingo;


    }
}
/*
{
    public static void main(String[] args) throws Exception
    {
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        //напишите тут ваш код
        HashMap<String, Cat> catss = new HashMap<String, Cat>();
        for (String s : cats)
        {
            catss.put(s, new Cat(s));
        }
        return catss;

    }


    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
*/
/*
{
    public static void main(String[] args)
    {
        Map<String, String> set = new HashMap<String, String>();
        set.put("арбуз", "ягода");

        for (Map.Entry<String, String> pair : set.entrySet())
        {
            System.out.println(pair);
        }
    }
}
*/
