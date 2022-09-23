package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        //напишите тут ваш код
        Map<String,String> result = new LinkedHashMap<>();
        url = url.split("\\?")[1];

        String[] params = url.split("&");
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                String key;
                if(params[i].contains("=")){
                    key = params[i].substring(0,params[i].indexOf("="));
                    String value = params[i].substring(params[i].indexOf("=")+1,params[i].length());
                    result.put(key,value);
                }else {
                   result.put(params[i],"");
                }
            }


            for (String key: result.keySet()
                 ) {
                System.out.print(key + " ");
            }
            System.out.println("");

           for(Map.Entry<String,String> entry: result.entrySet())
           {
               if(entry.getKey().equals("obj")){
                       try {
                           alert(Double.valueOf(entry.getValue()));
                       }catch (Exception e){
                           alert(entry.getValue());
                       }
               }
           }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
