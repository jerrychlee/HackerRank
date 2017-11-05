import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] ar = new int[n];
        
        int pos = 0;
        int neg = 0;
        int zero = 0;
        
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            
            if(ar[ar_i]>0)
                pos++;
            else if(ar[ar_i]<0)
                neg++;
            else
                zero++;
        }
        
        System.out.println(pos/(float)n);
        System.out.println(neg/(float)n);
        System.out.println(zero/(float)n);
        
    }
