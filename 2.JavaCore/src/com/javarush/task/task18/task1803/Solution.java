package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        long n = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        HashMap<Integer,Integer> result = new HashMap<>();

        while (fileInputStream.available()>0){
            int byt = fileInputStream.read();
            result.put(byt,result.getOrDefault(byt,0)+1);
        }
        int max = 0;
        for (Integer value: result.values()
             ) {
            if(value > max) {
                max = value;
            }
        }
        for (Map.Entry<Integer,Integer> map: result.entrySet()
                ) {
            if(map.getValue() == max) {
                System.out.print(map.getKey() + " ");
            }
        }



        fileInputStream.close();
        System.out.println(System.currentTimeMillis() - n);
    }
}
