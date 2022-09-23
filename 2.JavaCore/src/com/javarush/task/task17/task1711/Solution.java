package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public  static void main(String[] args) {
        //start here - начни тут
        String name;
        String sex;
        String bd;
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);
        if(args.length > 0)
        switch (args[0]){
            case ("-c"): synchronized(allPeople){
                int start = 1;
                while (true){
                    try {
                        name = args[start];
                        sex = args[start+1];
                        date = dateFormat.parse(args[start+2]);
                        allPeople.add(Person.adapterCreatePerson(sex,name,date));
                        System.out.println(allPeople.size() - 1 );

                        if(args.length < start + 4)
                            break;
                        else
                            start +=3;

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }
                break;
            }
            case ("-u"): synchronized(allPeople){
                int start = 1;
                while (true){
                    try {
                        int id = Integer.parseInt(args[start]);
                        name = args[start+1];
                        sex = args[start+2];
                        date = dateFormat.parse(args[start+3]);
                        allPeople.get(id).setName(name);
                        allPeople.get(id).setBirthDate(date);
                        allPeople.get(id).setSex(sex);

                        if(args.length < start + 5)
                            break;
                        else
                            start +=4;

                    } catch (ParseException e) {
                        e.printStackTrace();
                    }

                }
                break;
            }
            case ("-d"): synchronized(allPeople){
                int start = 1;
                while (true){
                    int id = Integer.parseInt(args[start]);
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setBirthDate(null);
                    allPeople.get(id).setSex((Sex) null);

                    if(args.length < start + 2)
                        break;
                    else
                        start++;
                }
                break;
            }
            case ("-i"): synchronized(allPeople){
                int start = 1;
                while (true){
                    int id = Integer.parseInt(args[start]);
                    System.out.println(allPeople.get(id));
                    if(args.length < start + 2)
                        break;
                    else
                        start++;
                }
                break;
            }
        }
    }
}
