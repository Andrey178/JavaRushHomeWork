package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Admin on 14.04.2016.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 24;
    }
    String getDescription()
    {
        String whoami = super.getDescription();
        String mycountry = Country.RUSSIA;
        int power = getCountOfEggsPerMonth();
        String opisanie = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", whoami, mycountry, power);
        return opisanie;
    }
}
