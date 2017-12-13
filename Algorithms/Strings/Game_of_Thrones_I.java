import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        // Complete this function
        int []Array = new int[26];
        for(int i=0; i<s.length();i++){
            Array[s.charAt(i)-'a']++;
        }
        
        int odd=0;
        for(int j=0; j<26; j++){
            if(Array[j]%2==1)
                odd++;
        }
        
        return (odd>1) ? "NO":"YES"; 
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}