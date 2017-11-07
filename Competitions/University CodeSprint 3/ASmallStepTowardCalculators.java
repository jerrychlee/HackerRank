import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(String opr) {
        // Complete this function
        if(opr.length()!=3)
            return 0;
    
        return (opr.charAt(1)=='+')?(opr.charAt(0)-'0')+(opr.charAt(2)-'0'):(opr.charAt(0)-'0')-(opr.charAt(2)-'0'); 

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}