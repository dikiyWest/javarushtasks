package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            File file = new File(reader.readLine());
            FileOutputStream fs = new FileOutputStream(file);
            OutputStreamWriter ow = new OutputStreamWriter(fs);
            BufferedWriter br = new BufferedWriter(ow);

            String text;
            while (true){
                text = reader.readLine();
                br.write(text+ System.lineSeparator());
                if(text.equals("exit"))
                    break;
            }
            br.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
