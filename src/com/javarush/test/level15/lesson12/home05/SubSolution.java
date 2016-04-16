package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Admin on 16.04.2016.
 */
public class SubSolution extends  Solution
{
    private SubSolution(Integer i)
    {
        super(i);
    }

    private SubSolution(String s, Integer i)
    {
        super(s, i);
    }

    private SubSolution(Integer m, String s)
    {
        super(m, s);
    }


    SubSolution(int i, String s)
    {
        super(i, s);
    }

    SubSolution(String s, int i)
    {
        super(s, i);
    }

    SubSolution(String m, String s)
    {
        super(m, s);
    }

    public SubSolution()
    {
    }

    public SubSolution(int i)
    {
        super(i);
    }

    public SubSolution(int i, int m)
    {
        super(i, m);
    }

    protected SubSolution(Object o)
    {
        super(o);
    }

    protected SubSolution(Object o, int i)
    {
        super(o, i);
    }

    protected SubSolution(Object o, String s)
    {
        super(o, s);
    }
}
