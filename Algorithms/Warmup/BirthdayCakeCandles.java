import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        Arrays.sort(ar);
        
        int count=0;
        int max = ar[n-1];
        int p = ar[n-1];
        
        while(max == p){
            count++;
            if(count <= (n-1))
                p = ar[n-1-count];
            else
                break;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

