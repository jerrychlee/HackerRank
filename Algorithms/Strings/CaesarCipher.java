import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int k = in.nextInt();
        
        char [] c = new char[n]; 
        
        for(int i=0; i<n; i++){
            c[i] = encrypt(s.charAt(i), k);
        }
            
        System.out.println(c);
        
        in.close();
    }
    
    public static char encrypt(char c, int k){
        if(Character.isAlphabetic(c)){
            char base = Character.isUpperCase(c)? 'A':'a';
            char out = (char)((c-base+k)%26 + base);
            return out;
        }else
            return c;
        
    }
}