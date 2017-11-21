import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long solve(long n) {
        // Complete this function
        int count = 0;
        long t=n;
        while(t!=0){
            if(t%2==0){
                count++;
            }
            t=t/2;
        }       
        return (long)Math.pow(2,count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
