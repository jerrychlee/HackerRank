import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String super_reduced_string(String s){
        // Complete this function
        String out = new String(s);
        
    OuterLoop:
        while(true){
            boolean change = false;
            for(int i=0;i<out.length()-1;i++){
                if(out.charAt(i)==out.charAt(i+1)){
                    out = out.substring(0,i) + ((i+2<out.length()) ? out.substring(i+2,out.length()) : "");
                    change = true;
                    continue OuterLoop;
                }
            }
            if(change==false)
                break;
        }
        if(out.length()==0)
            out = "Empty String";
        
        return out;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

