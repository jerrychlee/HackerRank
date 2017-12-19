import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        revert(a, 0, n-1);
        revert(a, 0, n-k-1);
        revert(a, n-k, n-1);     
        
        for(int num: a){
            System.out.print(num+" ");        
        }
    }
    
    public static void revert(int []array, int start, int end){
        int l = start;
        int r = end;
        while(l<r){
            int tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
            l++;
            r--;
        }
    }
}
