import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int []ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
        
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            
            if(ar[mid]==v){
                System.out.println(mid);
                break;
            }
            
            if(ar[mid]>v){
                high = mid-1;
            }else
                low = mid+1;
        }
    }
}
