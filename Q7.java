// Question: https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i, j;
        n = scan.nextInt();
        scan.nextLine();
        String s[] = new String[n];

        for(i = 0; i < n; i++){
            s[i] = scan.nextLine();
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < s[i].length(); j++){
                if(j%2 == 0){
                    System.out.print(s[i].charAt(j));
                }
            }
            System.out.print(" ");
            for(j = 0; j < s[i].length(); j++){
                if(j%2 == 1){
                    System.out.print(s[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
