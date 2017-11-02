import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] buf = new int[n];

        for(int i=0; i<n; i++){
            buf[i] = scanner.nextInt();
        }        
        scanner.close();
        
        for(int i=0; i<n; i++){
            System.out.printf(buf[n-1-i] + " ");    
        }
        
    }
}