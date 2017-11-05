import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int [] data = {a0,a1,a2,b0,b1,b2};
        
        for(int i=0;i<6;i++){
            //check input data
            if(data[i]<0) data[i]=0;
            if(data[i]>100) data[i]=100;
        }
        
        int [] out = new int[2];
        
        for(int j=0; j<3; j++){
            //Start compare
            if(data[j]>data[j+3])
                out[0]++;
            else if(data[j]<data[j+3])
                out[1]++;
            else{}
        }
        
        return out;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }
