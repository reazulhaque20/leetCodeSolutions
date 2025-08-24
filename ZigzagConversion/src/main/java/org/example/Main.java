package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Test cases
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Example 1 Output: " + solution.convert(s1, numRows1));

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Example 2 Output: " + solution.convert(s2, numRows2));

        String s3 = "A";
        int numRows3 = 1;
        System.out.println("Example 3 Output: " + solution.convert(s3, numRows3));
    }
}