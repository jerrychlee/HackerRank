import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int weight = 0;
        int lastWeight = 0;
        int count = 0;
        Set set = new HashSet();        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            weight = (int)(c-'a')+1;            
            if(lastWeight==weight){
                count++;
                set.add(weight*count);
            }
            else{
                set.add(weight);
                count = 1;
                lastWeight = weight;                
            }
                
        }
        
        //debug
        //System.out.println(set);
        
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            // your code goes here
            System.out.println(set.contains(x)?"Yes":"No");
        }
    }
}