import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a){
        // Complete this function
        int i = 0;
        int j = a.length-1;
        int sumL = a[i];
        int sumR = a[j];
        while(i!=j){
            if(sumL>sumR){
                j--;
                sumR+=a[j];
            }else{
                i++;
                sumL+=a[i];
            }
        }
        
        if(sumL==sumR)
            return "YES";
        
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
