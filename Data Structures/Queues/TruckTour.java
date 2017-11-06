import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Queue<Integer> q = new LinkedList();
        Queue<Integer> u = new LinkedList();        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0; i<n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            q.add(a-b);            
        }        
        int sum = 0;
        int index = 0;
        int count = 0;
        while(q.peek()!=null){

            sum+=q.peek();
            u.add(q.remove());
            count++;            
            
            if(sum <0){
                sum = 0;
                index=count;                
                while(u.peek()!=null){
                    q.add(u.remove());    
                }
            }            
        }        
        System.out.println(index);
        in.close();
    }
}