import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[in.nextInt()]++;
        }
        
        for(int i=0;i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
