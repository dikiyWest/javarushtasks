package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try{
            int array[] = {1, 2, 3};
            int a =  array[4];
        }
        catch(Exception e){
            exceptions.add(e);
        }
        try {
            File f = new File("D://java/file.txt");
            FileReader fr = new FileReader(f);
        }catch (Exception e){
            exceptions.add(e);
        }
        try {
            Integer.parseInt("");
        }catch (NumberFormatException e){
            exceptions.add(e);
        }
        try {
            throw new IllegalArgumentException(String.valueOf(2));
        }catch (Exception e){
            exceptions.add(e);
        }
        try {
            exceptions.get(100);
        }catch (Exception e){
            exceptions.add(e);
        }
        try {
            throw new RuntimeException(String.valueOf(22222222));
        }catch (Exception e){
            exceptions.add(e);
        } try {
            throw new IOException(String.valueOf(557657));
        }catch (Exception e){
            exceptions.add(e);
        } try {
            throw new SocketException(String.valueOf(123213));
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new Exception(String.valueOf(38657));
        }catch (Exception e){
            exceptions.add(e);
        }




        //напишите тут ваш код

    }
}
