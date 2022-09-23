package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        String strCurrentLine = "";
        File puth = new File(Statics.FILE_NAME);
        try {
            FileInputStream in = new FileInputStream(puth);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while ((strCurrentLine = reader.readLine()) != null) {
                lines.add(strCurrentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
