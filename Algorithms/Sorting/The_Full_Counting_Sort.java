import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> [] array = new ArrayList[100];
        for(int i=0; i<100; i++){
            array[i] = new ArrayList();
        }
        for(int i=0; i<n; i++){
            int num = in.nextInt();
            String s = in.next();
            array[num].add((i<n/2)?"-":s);
        }
        for(int i=0; i<100; i++){
            for(int j=0; j<array[i].size(); j++){
                System.out.print(array[i].get(j)+" ");
            }
        }
    }
}
