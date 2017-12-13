import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        // Complete this function
        int count = 0;
        char current = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            if(current==c){
                count++;
            }else{
                current = c;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}