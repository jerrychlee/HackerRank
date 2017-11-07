import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        char c = Character.toUpperCase(A.charAt(0));
        char d = Character.toUpperCase(B.charAt(0));
        System.out.println(c+A.substring(1,A.length())+" "+d+B.substring(1,B.length()));
        
    }
}
