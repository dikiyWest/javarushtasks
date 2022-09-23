package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }


    public static Planet thePlanet;
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch (reader.readLine()){
            case (Planet.SUN): thePlanet =   Sun.getInstance(); break;
            case (Planet.MOON): thePlanet =  Moon.getInstance(); break;
            case (Planet.EARTH): thePlanet = Earth.getInstance(); break;
            default: thePlanet = null;
        }
    }
}
