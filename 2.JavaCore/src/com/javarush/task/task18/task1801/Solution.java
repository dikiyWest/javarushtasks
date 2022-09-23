package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        int max = 0;

        while (fileInputStream.available()>0){
            int byt = fileInputStream.read();
            if(byt > max)
                max =byt;

        }
        System.out.println(max);
        fileInputStream.close();
    }
}
