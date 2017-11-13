import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        Comparator<String> comp = new myCompare();
        Arrays.sort(unsorted, comp);
        
        for(int i=0; i<n; i++)
            System.out.println(unsorted[i]);
        
    }
    
    public static class myCompare implements Comparator
    {
        public int compare(Object o1, Object o2)
        {
            String s1 = (String)o1;
            String s2 = (String)o2;
            
            if(s1.length() == s2.length())
                return s1.compareTo(s2);
            else
                return s1.length() < s2.length() ? -1:1;
        }
    }
    
}

