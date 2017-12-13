import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int palindromeIndex(String s){
        // Complete this function
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)-s.charAt(s.length()-1-i)!=0){
                if((s.charAt(i)-s.charAt(s.length()-1-i-1)==0)&&
                    (s.charAt(i+1)-s.charAt(s.length()-1-i-2)==0))
                    return s.length()-1-i;
                else
                    return i;                    
            }               
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}