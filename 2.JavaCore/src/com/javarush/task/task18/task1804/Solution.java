package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        reader.close();
        HashMap<Integer,Integer> result = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int byt = fileInputStream.read();
            result.put(byt,result.getOrDefault(byt,0)+1);
        }
        fileInputStream.close();
        int min = Collections.min(result.values());

        for (Map.Entry<Integer,Integer> map: result.entrySet()
             ) {
            if(map.getValue() == min)
                System.out.print(map.getKey() + " ");
        }


    }
}
