import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        int h1[] = new int[n1];
        Stack s1 = new Stack();
        
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[n1-1-h1_i] = in.nextInt();
        }
        
        for(int i=0; i<n1; i++){
            sum1 += h1[i];
            s1.push(sum1);
        }
        
        int h2[] = new int[n2];
        Stack s2 = new Stack();
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[n2-1-h2_i] = in.nextInt();
        }
        
        for(int i=0; i<n2; i++){
            sum2 += h2[i];
            s2.push(sum2);
        }
        
        int h3[] = new int[n3];
        Stack s3 = new Stack();
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[n3-1-h3_i] = in.nextInt();
        }
        
        for(int i=0; i<n3; i++){
            sum3 += h3[i];
            s3.push(sum3);
        }
        
        sum1 = (int)s1.peek();
        sum2 = (int)s2.peek();
        sum3 = (int)s3.peek();
        
        while(!s1.empty()&&!s2.empty()&&!s3.empty()){
            
            if(sum1==sum2 && sum2==sum3) {
                System.out.println(sum1);
                return;
            }
            
            while(sum1 > sum2 || sum1 > sum3) {
                sum1 = (int)s1.pop();
                if(s1.empty()){
                    System.out.println(0);
                    return;
                }
                
            }
            
            while(sum2 > sum1 || sum2 > sum3) {
                sum2 = (int)s2.pop();
                if(s2.empty()){
                    System.out.println(0);
                    return;
                }
            }
            
            while(sum3 > sum1 || sum3 > sum2) {
                sum3 = (int)s3.pop();
                if(s3.empty()){
                    System.out.println(0);
                    return;
                }
            }
        }
        
        System.out.println(0);
        
    }
}

