import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
        // Complete this function
        if(s.length()%2!=0)
            return -1;
        
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        int [] array = new int[26];
        int count =0;
        
        for(int i=0;i<s1.length();i++){
            array[s1.charAt(i)-'a']++;
            array[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<array.length;i++){
            count += Math.abs(array[i]);
        }
        
        return count/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
