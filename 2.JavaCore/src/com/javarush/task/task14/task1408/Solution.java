package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country){
                case "Ukraine": return new UkrainianHen();
                case "Russia": return new RussianHen();
                case "Moldova": return new MoldovanHen();
                case "Belarus": return new BelarusianHen();
            }
            return hen;
        }
    }




}
