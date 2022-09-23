package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String fileName1 = reader.readLine();
                String fileName2 = reader.readLine();
                reader.close();
                String str;
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName1))));
                while (( str = reader1.readLine()) != null){
                    allLines.add(str);
                }
                reader1.close();
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName2))));
                while (( str = reader2.readLine()) != null){
                    forRemoveLines.add(str);
                }
                reader2.close();
            new Solution().joinData();


        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

            if(allLines.containsAll(forRemoveLines)){
                allLines.removeAll(forRemoveLines);
            }else {
                allLines.clear();
                throw new CorruptedDataException();
            }

    }
}
