import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            boolean isBeauty=false;
            // your code goes here
            long first=0;
            for(int i=1; i<=s.length()/2; i++){
                long x = Long.parseLong(s.substring(0,i));
                first = x;
                String beauty = Long.toString(x);
                while(beauty.length()<s.length()){
                    beauty = beauty.concat(Long.toString(++x));
                }
                if(beauty.equals(s)){
                    isBeauty=true;
                    break;
                }
                    
            }
            System.out.println(isBeauty? "YES "+first:"NO");
        }
    }
}