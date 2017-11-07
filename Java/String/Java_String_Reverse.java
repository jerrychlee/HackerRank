import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int low = 0;
        int high = A.length()-1;
        while(low<=high){
            if(A.charAt(low)!=A.charAt(high)){
                System.out.println("No");
                break;
            }else{
                low++;
                high--;                                
            }
        }
        
        if(low>=high)
            System.out.println("Yes");
    }
}