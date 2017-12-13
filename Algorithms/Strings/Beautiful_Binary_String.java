import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        // Complete this function
        String s= "010";
        int length = B.length();
        int i = 0;
        int count = 0;
        while(i<length-2){
           if(s.equals(B.substring(i,i+3))){
               count++;
               i+=3;
           }else
               i++;               
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}