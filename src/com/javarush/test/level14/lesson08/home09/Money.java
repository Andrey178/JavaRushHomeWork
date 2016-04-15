package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private static double amount;
    public Money(double amount)
    {
        this.amount = amount;
    }
    public Money()
    {
        this(0);
    }
    public Money(int amount)
    {
        this((double) amount);
    }

    public double getAmount()
    {
        return this.amount;
    }

    public abstract String getCurrencyName();
}

