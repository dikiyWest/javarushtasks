package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ UKRAINE + ". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
