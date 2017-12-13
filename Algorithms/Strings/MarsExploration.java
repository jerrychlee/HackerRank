import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        for(int i=0; i<S.length();i++){
            if(i%3==0||i%3==2){
                if(S.charAt(i)!='S')
                    count++;
            }else if(i%3==1){
                if(S.charAt(i)!='O')
                    count++;                
            }
        }
        
        System.out.println(count);
    }
}
