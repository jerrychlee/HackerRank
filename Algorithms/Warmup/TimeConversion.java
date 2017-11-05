import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String timeConversion(String s) {
        // Complete this function
        int length = s.length();
        Integer i = Integer.valueOf (s.substring(0,2),10);
        String out = "";
        
        if(s.substring(length-2,length-1).equals("P")){
            i+=12;
            if(i==24){
                out = "12" + s.substring(2,length-2);
            }else{
                out = Integer.toString(i) + s.substring(2,length-2);
            }
            
        }
        else{
            if(i==12){
                out = "00" + s.substring(2,length-2);
            }else{
                out = s.substring(0,length-2);
            }
        }
        return out;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
