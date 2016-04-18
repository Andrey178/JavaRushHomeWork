package com.javarush.testweb.lv15.ls09.ts01;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls09ts01

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

{
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put((double)1, "A");
        labels.put((double)2, "B");
        labels.put((double)3, "C");
        labels.put((double)4, "D");
        labels.put((double)5, "E");
    }


    public static void main(String[] args) {
        System.out.println(labels);
//        labels.put((double)1, "a");
    }
}
