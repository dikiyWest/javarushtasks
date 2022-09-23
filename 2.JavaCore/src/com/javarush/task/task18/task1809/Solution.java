package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        reader.close();
        byte i = 0;
        byte[] bytes = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0){
            bytes[i] = (byte) fileInputStream.read();
            i++;
        }
        for (int a = bytes.length - 1; a >= 0 ; a--) {
            fileOutputStream.write(bytes[a]);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
