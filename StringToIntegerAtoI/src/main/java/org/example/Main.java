package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "42";
        System.out.println("Test Case-1=> "+solution.myAtoi(s));
        s = "   -042";
        System.out.println("Test Case-2=> "+solution.myAtoi(s));
        s = "1337c0d3";
        System.out.println("Test Case-3=> "+solution.myAtoi(s));
        s = "0-1";
        System.out.println("Test Case-4=> "+solution.myAtoi(s));
        s = "words and 987";
        System.out.println("Test Case-5=> "+solution.myAtoi(s));
    }
}