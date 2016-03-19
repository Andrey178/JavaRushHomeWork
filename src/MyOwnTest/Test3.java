package MyOwnTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Admin on 08.03.2016.
 */
public class Test3
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        list.add("рола"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.contains("р"))
            {
                list.remove(i);
                i--;
            }
            if (s.contains("л"))
            {
                list.add(++i, s.concat("22"));

            }
        }
        return list;
    }
}