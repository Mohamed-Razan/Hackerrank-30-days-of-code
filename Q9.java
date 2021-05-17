// Question: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            a.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(a.get(s) == null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+a.get(s));
            }
        }
        in.close();
    }
}
