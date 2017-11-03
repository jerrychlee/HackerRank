import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] leftRotation(int[] a, int d) {
        // Complete this function
        int length = a.length;
        int shift = d%length;
        
        Stack s = new Stack(); 
        
        for(int i=0; i<shift; i++){
            s.push(a[i]); 
        }
        
        int [] out = new int[length];
        
        //out = Arrays.copyOfRange(a, shift, length-1);
        for(int i=0; i<length-shift; i++){
            out[i] = a[shift+i];        
        }
        
        for(int i=0; i<shift; i++){
            out[length-1-i] = (int)s.pop();        
        }
        
        return out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}