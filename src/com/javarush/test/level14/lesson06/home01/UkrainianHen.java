package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Admin on 14.04.2016.
 */
public class UkrainianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 2;
    }
    String getDescription()
    {
        String whoami = super.getDescription();
        String mycountry = Country.UKRAINE;
        int power = getCountOfEggsPerMonth();
        String opisanie = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", whoami, mycountry, power);
        return opisanie;
    }
}