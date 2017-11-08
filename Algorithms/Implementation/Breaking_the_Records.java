import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int h=s[0],l=s[0];
        int [] out = new int[2];
        for(int i=1; i<s.length; i++){
            if(s[i]>h){
                h=s[i];
                out[0]++;                
            }else if(s[i]<l){
                l=s[i];
                out[1]++;                                
            }
        } 
        return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
