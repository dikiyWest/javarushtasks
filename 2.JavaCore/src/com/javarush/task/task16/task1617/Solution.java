package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args)  {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        try {
            Thread.sleep(3500);
            clock.interrupt();
            if(numSeconds == 0){
                System.out.println("3 2 1 Марш!");
            }else {
                System.out.println("4 3 2 1 Прервано!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while (!isInterrupted()){
                try {
                    Thread.sleep(1000);
                    numSeconds--;
                    if(numSeconds == 0)
                        interrupt();
                } catch (InterruptedException e) {


                }
            }
        }
    }
}
