import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int [] array = new int[n];
        for(int i=0;i<s; i++){
            array[in.nextInt()]++;
        }
        int pre = -1;
        int max = 0;
        for(int i=0;i<n; i++){
            if(array[i]==1){
                if(pre!=-1){
                    max = ((i-pre)/2)>max ? ((i-pre)/2) : max;
                    pre = i;
                }else{
                    max = i;
                    pre = i;
                }
            }
            if(i==n-1){
                max = (n-1-pre)>max ? (n-1-pre) : max;
            }
        }
        System.out.println(max);
    }
}
