package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            InputStream inputStream = new FileInputStream(reader.readLine());
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(inputStream)
            );
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            inputStream.close();
            reader.close();
            br.close();
                    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}