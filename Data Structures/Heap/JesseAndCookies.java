import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
            
        int N = in.nextInt();
        int K = in.nextInt();
        PriorityQueue<Integer> cookie = new PriorityQueue<Integer>();
        for(int i=1; i<=N; i++) {
            cookie.add(in.nextInt());
        }
        
        int count = 0;
        while(cookie.size()>=2 && cookie.peek()<K){
            int a = cookie.poll();
            int b = cookie.poll();
            
            cookie.add(1*a+2*b);
            count++;
        }       

        if(cookie.peek()<K)
            System.out.println(-1);
        else
            System.out.println(count);
           
        in.close();
    }
}