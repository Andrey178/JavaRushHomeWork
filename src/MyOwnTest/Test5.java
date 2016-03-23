package MyOwnTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Admin on 22.03.2016.
 */
public class Test5
{

    public static void main(String[] args)
    {
        HashMap<String, Date> birthdaylist = createMap();
        removeAllSummerPeople(birthdaylist);
//        birthdaylist.remove("Stallone");
        System.out.println("------------------");
        removeAllSummerPeople(birthdaylist);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Rockie1", new Date("JUNE 1 1986"));
        map.put("Rockie2", new Date("MAY 5 1988"));
        map.put("Rockie3", new Date("JULY 10 1990"));
        map.put("Rockie4", new Date("AUGUST 12 1992"));
        map.put("Rockie5", new Date("SEPTEMBER 14 1994"));
        map.put("Rockie6", new Date("OCTOBER 16 1996"));
        map.put("Rockie7", new Date("MAY 20 1998"));
        map.put("Rockie11", new Date("JUNE 10 1976"));
        map.put("Rockie13", new Date("JULY 2 1978"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> pair = map.entrySet().iterator();
        while (pair.hasNext())
        {
            Map.Entry<String, Date> entry = pair.next();
//            String name = entry.getKey();
            int month = entry.getValue().getMonth();
            System.out.println(entry.getKey() + " : " + (month + 1));
            if (month > 4 && month < 8)
            {
                pair.remove();
            }

        }
///*
/*        for (HashMap.Entry<String, Date> pair : map.entrySet())
        {
            Date birthmonth = pair.getValue();
            String name = pair.getKey();
            int month = birthmonth.getMonth();
            System.out.println(pair.getKey() + " : " + month);
            if (month > 4 && month < 8)
            {
//                System.out.println(month + 1);
//                System.out.println(pair);
                map.remove();
            }
        }
*/
    }
}
