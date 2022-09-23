package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* 
Клубок
*/

public class Solution{
    public static List<Thread> threads = new ArrayList<>(5);
    public static whileTrue whileTrue = new whileTrue();
    public static Thread2 interruptedException = new Thread2();
    public static Thread3 happy = new Thread3();
    public static Thread4 thread4 = new Thread4();
    public static Thread5 thread5 = new Thread5();

    static {
        threads.add(whileTrue);
        threads.add(interruptedException);
        threads.add(happy);
        threads.add(thread4);
        threads.add(thread5);
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
    }





    public static class whileTrue extends Thread  {
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class Thread2 extends Thread  {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e.toString());

            }

        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while (!isInterrupted()){

            }
        }

        @Override
        public void showWarning() {
            if(isAlive()){
                this.interrupt();
            }
        }
    }
    public static class Thread5 extends Thread{
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int result = 0;
            try {
                while (true){
                    result += Integer.parseInt(reader.readLine());
                }

            }catch (NumberFormatException n)
            {
                System.out.println(result);
            }
            catch (IOException e) {

            }
        }

    }

}