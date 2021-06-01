// Question: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int i, j, sum  = 0, rem, max = 0;
        for(i = n; i != 0; i/=2){
            rem = i%2;
            if(rem == 1){
                sum++;
            }
            else{
                if(sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        if(sum > max){
            max = sum;
        }
        System.out.println(max);
    }
}
