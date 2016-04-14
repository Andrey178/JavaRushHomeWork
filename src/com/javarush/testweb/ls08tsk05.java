package com.javarush.testweb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 22.03.2016.
 */
public class ls08tsk05
{
    public static void main(String[] args)
    {
        HashMap<String, String> mapp = createMap();
        System.out.println(mapp);
        removeTheFirstNameDuplicates(mapp);
        System.out.println("-------------------");
        System.out.println(mapp);
     }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Petr");
        map.put("Sergeev", "Sergei");
        map.put("Ikonov", "Ivan");
        map.put("Popov", "Petr");
        map.put("Sernov", "Miha");
        map.put("Gorohov", "Ivan");
        map.put("Petnov", "Petr");
        map.put("Sebeev", "Misha");
        map.put("Megeev", "Serg");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        Set<String> myhashset = new HashSet<String>();
        Map<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            String s = pair.getValue();
            System.out.println(myhashset.contains(s) + " : " + s);
            if (myhashset.contains(s))
            {
                removeItemFromMapByValue(map, s);
            } else {
                myhashset.add(s);
            }
        }
        System.out.println(myhashset);
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
