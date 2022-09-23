package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.2,"sadczx");
        labels.put(2.3,"sadczx1");
        labels.put(2.4,"sadczx2");
        labels.put(2.5,"sadczx3");
        labels.put(2.6,"sadczx4");
    }



    public static void main(String[] args) {
        System.out.println(labels);
    }
}
