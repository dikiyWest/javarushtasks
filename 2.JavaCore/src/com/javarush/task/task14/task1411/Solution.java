package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList keys = new ArrayList<String>() {
            {add("user");
            add("loser");
            add("proger");
            add("coder");}
        };

        while (true)
        //тут цикл по чтению ключей, пункт 1
        {
            key = reader.readLine();
            if(!keys.contains(key)){
                break;
            }

            switch (key){
                case "user": person = new Person.User(); break;
                case "loser": person = new Person.Loser(); break;
                case "proger": person = new Person.Proger(); break;
                case "coder": person = new Person.Coder(); break;
            }
            //создаем объект, пункт 2

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if(person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if(person instanceof Person.Coder)
        {
            Person.Coder coder = (Person.Coder) person;
            coder.writeCode();
        } else if( person instanceof Person.Proger){
            Person.Proger proger = (Person.Proger) person;
            proger.enjoy();
        } else {
            Person.Loser loser = (Person.Loser) person;
            loser.doNothing();
        }

    }
}
