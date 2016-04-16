package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    protected Solution(Object o) {}
    protected Solution(Object o, int i) {}
    protected Solution(Object o, String s) {}

    Solution(int i, String s) {}
    Solution(String s, int i) {}
    Solution(String m, String s) {}

    private Solution(Integer i) {}
    private Solution(Integer i, String s) {}
    private Solution(String s, Integer i) {}

    public Solution() {}
    public Solution(int i) {}
    public Solution(int i, int m) {}
}

