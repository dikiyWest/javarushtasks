package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {

    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ MOLDOVA + ". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
