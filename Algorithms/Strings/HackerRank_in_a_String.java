import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String hackerrank = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String out = "NO";
            String s = in.next();
            // your code goes here
            int j=0;
            for(int i=0; i<s.length(); i++){
                char c = hackerrank.charAt(j);
                if(c == s.charAt(i))
                    j++;
                if(j>=hackerrank.length()){
                    out = "YES";
                    break;
                }
            }
            System.out.println(out);
        }
    }
}
