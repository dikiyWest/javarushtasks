package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar = 2;
    public double doubleVar = 2.2;
    public Double DoubleVar = 2.3;
    public boolean booleanVar = true;
    public Object ObjectVar = 221;
    public Exception ExceptionVar = new Exception();
    public String StringVar = "1";
    public static void main(String[] args) {
        System.out.println(new Solution().intVar);
        System.out.println(new Solution().doubleVar);
        System.out.println(new Solution().DoubleVar);
        System.out.println(new Solution().booleanVar);
        System.out.println(new Solution().ObjectVar);
        System.out.println(new Solution().ExceptionVar);
        System.out.println(new Solution().StringVar);
    }

}
