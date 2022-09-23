package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        if (args.length > 0)
            switch (args[0]) {
                case ("-c"):
                    try {
                        String name = args[1];
                        date = dateFormat.parse(args[3]);
                        if (args[2].equals("м"))
                            allPeople.add(Person.createMale(name, date));
                        else
                            allPeople.add(Person.createFemale(name, date));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    System.out.println(allPeople.size() -1);
                    break;
                case ("-r"):
                    System.out.println(allPeople.get(Integer.parseInt(args[1])));
                    break;
                case ("-u"):
                    try {
                        int id = Integer.parseInt(args[1]);
                        String name = args[2];
                        date = dateFormat.parse(args[4]);
                        String sex = args[3];
                        allPeople.get(id).setName(name);
                        allPeople.get(id).setBirthDate(date);
                        if (sex.equals("м"))
                            allPeople.get(id).setSex(Sex.MALE);
                        else
                            allPeople.get(id).setSex(Sex.FEMALE);

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                case ("-d"):
                    int id = Integer.parseInt(args[1]);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDate(null);
                    allPeople.get(id).setName(null);
            }

    }

}
