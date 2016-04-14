package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Admin on 14.04.2016.
 */
public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 4;
    }
    String getDescription()
    {
        String whoami = super.getDescription();
        String mycountry = Country.MOLDOVA;
        int power = getCountOfEggsPerMonth();
        String opisanie = String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", whoami, mycountry, power);
        return opisanie;
    }
}
