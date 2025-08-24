package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 123;
        System.out.println("Test Case-1=> "+solution.reverse(x));
        x = -123;
        System.out.println("Test Case-2=> "+solution.reverse(x));
        x = 120;
        System.out.println("Test Case-3=> "+solution.reverse(x));
    }
}