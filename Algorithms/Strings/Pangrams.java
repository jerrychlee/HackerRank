import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int [] alpha = new int[26];
        boolean isPangram = true;
            
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);         
            if(Character.isAlphabetic((int)c)){
                c = Character.toLowerCase(c);
                alpha[(int)(c-'a')]=1;        
            }
        }
        
        for(int j=0; j<26; j++){
            if(alpha[j]==0){
                isPangram = false;
                break;                
            }            
        }
        
        System.out.println((isPangram)?"pangram":"not pangram");
        
        in.close();
    }
}