package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));





            while (true) {
                String inReader = reader.readLine();
                if (inReader.equals("exit"))
                    break;

                try {
                    if (inReader.contains("."))
                        print(Double.valueOf(inReader));
                    else if (Integer.parseInt(inReader) > 0 && Integer.parseInt(inReader) < 128)
                        print(Short.valueOf(inReader));
                    else if (Integer.parseInt(inReader) <= 0 || Integer.parseInt(inReader) >= 128)
                        print(Integer.parseInt(inReader));
                }catch (Exception e){
                    print(inReader);
                }

            }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
