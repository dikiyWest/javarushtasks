package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> memory = new HashMap<>();
        Integer id;
        while (true) {
            try {
                id = Integer.parseInt(reader.readLine());
            }catch (Exception e){
                break;
            }

            String name = reader.readLine();
            if(!name.isEmpty()){
                memory.put(name,id);
            }else{
                if(id != null)
                    memory.put("",id);
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : memory.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
