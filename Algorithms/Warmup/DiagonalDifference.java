import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n*n];
        for(int ar_i = 0; ar_i < n*n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        
        
        int [] diagonal = new int[2*n];
        
        for(int i=0; i<n; i++){
            diagonal[i] = ar[(n+1)*i];
            diagonal[i+n] = ar[(n-1)*(i+1)];
        }
        
        int count1 = 0;
        int count2 = 0;
        
        for(int k=0;k<n;k++){
            count1 += diagonal[k];
            count2 += diagonal[k+n];
        }
        System.out.println(Math.abs(count1-count2));
        in.close();
    }
}
