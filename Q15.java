// Question: https://www.hackerrank.com/challenges/30-scope/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	Difference(int elements[]){
        this.elements = elements;
    }
    void computeDifference() {
        int i, j, sum, max = 0;
        for(i = 0; i < elements.length-1; i++) {
            for(j = i+1; j < elements.length; j++) {
                sum = Math.abs(elements[i] - elements[j]);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        maximumDifference = max;
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}