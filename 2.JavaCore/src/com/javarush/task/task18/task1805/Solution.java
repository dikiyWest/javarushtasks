package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        ArrayList<Integer> integers = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            int byt = fileInputStream.read();
            if (!integers.contains(byt))
                integers.add(byt);
        }
        fileInputStream.close();
        Collections.sort(integers);
        for (Integer i : integers
                ) {
            System.out.print(i + " ");
        }
    }
}
