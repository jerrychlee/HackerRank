import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] count = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            count[a[a_i]]++;
        }

        int max=-1;
        for(int i=1;i<99;i++){
            if(count[i]+count[i+1]>max){
                max=count[i]+count[i+1];
            }
        }
        
        System.out.println(max);
    }
}
