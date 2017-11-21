import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long theGreatXor(long x){
        // Complete this function
        long count = 0;
        int index = 0;
        long tmp = x;
        while(tmp>0){
            if(tmp%2==0){
                count+=Math.pow(2,index);
            }
            tmp=tmp/2;
            index++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();
            long result = theGreatXor(x);
            System.out.println(result);
        }
    }
}
