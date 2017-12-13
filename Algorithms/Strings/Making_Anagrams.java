import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        // Complete this function
        int [] Array = new int[26];
        for(int i=0; i<s1.length(); i++){
            Array[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            Array[s2.charAt(i)-'a']--;            
        }
        
        int sum = 0;
        for(int i=0; i<26; i++){
            sum+=Math.abs(Array[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}