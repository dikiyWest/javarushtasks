package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static void main(String[] args) {

    }

    public class MyClass extends Thread
    {
        private String name1 = "Оля";
        private String name2 = "Лена";

        @Override
        public void run() {
            System.out.println(name1);
            swap();
        }

        public void swap()
        {
            String s = name1;
            name1 = name2;
            name2 = s;
        }
    }

    //напишите тут ваш код
}
