import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long out = 0;
        long sum = 0;    
        long [] array = new long[n];

        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            array[a-1] += k;
            if(b<=(n-1))
                array[b] -= k;            
        }

        
        for(int i=0; i<n; i++){            
            sum = sum + array[i];
            out = Math.max(out, sum);     
        }
        
        System.out.println(out);
        
        in.close();
    }
}