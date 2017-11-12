import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        // Complete this function
        if(a==null||a.length==0)
            return "NO";
        
        int total = 0;
        for(int i=0; i<a.length; i++){
            total+= a[i];    
        }
        int sum=0;
        for(int i=0; i<a.length; i++){
            if(i!=0)
                sum+=a[i-1];
            if((total-sum-a[i])==sum)
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
