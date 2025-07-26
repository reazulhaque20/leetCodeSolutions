package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] num1 = {1,3};
        int[] num2 = {2};
        Solution solution = new Solution();
        System.out.println(solution.findMedianSortedArrays(num1, num2));
    }
}

class Solution {
    private int m;
    private int n;
    private int[] nums1;
    private int[] nums2;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        m = nums1.length;
        n = nums2.length;
        this.nums1 = nums1;
        this.nums2 = nums2;
        int a = f(0, 0, (m + n + 1) / 2);
        int b = f(0, 0, (m + n + 2) / 2);
        return (a + b) / 2.0;
    }

    private int f(int i, int j, int k) {
        if (i >= m) {
            return nums2[j + k - 1];
        }
        if (j >= n) {
            return nums1[i + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[i], nums2[j]);
        }
        int p = k / 2;
        int x = i + p - 1 < m ? nums1[i + p - 1] : 1 << 30;
        int y = j + p - 1 < n ? nums2[j + p - 1] : 1 << 30;
        return x < y ? f(i + p, j, k - p) : f(i, j + p, k - p);
    }
}