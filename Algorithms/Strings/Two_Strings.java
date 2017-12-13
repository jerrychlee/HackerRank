import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        // Complete this function
        boolean isFound = false;
        Set<Character> set = new HashSet();
        for(int i=0; i<s1.length(); i++){
            set.add(s1.charAt(i));
        }
        
        for(int i=0;i<s2.length();i++){
            if(set.contains(s2.charAt(i))){
                isFound = true;
                break;                
            }
        }
        return isFound?"YES":"NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}