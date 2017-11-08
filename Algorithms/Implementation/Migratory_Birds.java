import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int [] type = new int[6];
        for(int i=0; i<n; i++){
            switch(ar[i]){
                case 1:
                    type[1]++;
                    break;
                case 2:
                    type[2]++;
                    break;
                case 3:
                    type[3]++;
                    break;
                case 4:
                    type[4]++;
                    break;
                case 5:
                    type[5]++;
                    break;
                default:
                    break;
            }
        }
        
        int max=0;
        int idx=0;
        for(int i=1; i<=5; i++) {
            if(max<type[i]){
                max=type[i];
                idx=i;                
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
