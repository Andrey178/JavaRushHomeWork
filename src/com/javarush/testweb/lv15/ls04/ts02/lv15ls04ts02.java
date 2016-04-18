package com.javarush.testweb.lv15.ls04.ts02;

/**
 * Created by Admin on 15.04.2016.
 */
public class lv15ls04ts02
/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

{
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }
    public static void printMatrix(short m, short n, String value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix((int) m, (int) n, (Object) value);
    }

    public static void printMatrix(short m, float n, String value) {
        System.out.println("Заполняем объектами short2");
        printMatrix(m, (short) n, value);
    }

    public static void printMatrix(int m, float n, String value) {
        System.out.println("Заполняем объектами short1");
        printMatrix((short)m, n, value);
    }

    public static void printMatrix(float m, float n, String value) {
        System.out.println("Заполняем объектами float2");
        printMatrix((int) m, n, value);
    }

    public static void printMatrix(float m, double n, String value) {
        System.out.println("Заполняем объектами float1");
        printMatrix( m, (float) n, value);
    }

    public static void printMatrix(double m, double n, String value) {
        System.out.println("Заполняем объектами double2");
        printMatrix((float) m, n, value);
    }

    public static void printMatrix(double m, Integer n, String value) {
        System.out.println("Заполняем объектами double1");
        printMatrix( m, (double) n, value);
    }

    public static void printMatrix(Integer m, Integer n, String value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix((double) m, n, value);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
//        printMatrix(m, n, (Object) value);
        printMatrix((Integer) m, (Integer) n, value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
