// Question: https://www.hackerrank.com/challenges/30-bitwise-and/problem

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
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int i, j, x, max = 0;

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int a[] = new int[n];
            for(i = 0; i < n; i++){
                a[i] = i+1;
            }

            for(i = 0; i < n-1; i++){
                for(j = i+1; j < n; j++){
                    x = a[i]&a[j];
                    if((x < k)&&(x > max)){
                        max = x;
                    }
                }
            }
            System.out.println(max);
            max = 0;
        }

        scanner.close();
    }
}
