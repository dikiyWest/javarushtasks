package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = null;
        BufferedReader fileReader = null;

        try {
             inputStream = new FileInputStream(reader.readLine());
             fileReader = new BufferedReader(new InputStreamReader(inputStream));
             String line;
             Integer bufferSort;
             ArrayList<Integer> list = new ArrayList<>();

             while ((line = fileReader.readLine())!= null){
                 if(line != null || !line.equals("")){
                    if( Integer.parseInt(line)%2 == 0){
                     list.add(Integer.parseInt(line));
                    }

                 }
             }
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size() - i - 1; j++) {
                    if(list.get(j)> list.get(j+1)){
                        bufferSort = list.get(j+1);
                        list.remove(j+1);
                        list.add(j,bufferSort);

                    }
                }
            }

            for (Integer item: list
                 ) {
                System.out.println(item);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
