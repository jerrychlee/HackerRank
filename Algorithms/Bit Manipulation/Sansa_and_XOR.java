import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int m=0; m<t; m++){
            int n = in.nextInt();
            int xor = 0;
            int [] Arr = new int[n];
            for(int i=0; i<n; i++){
                Arr[i] = in.nextInt();
            }
            
            if(n%2==0){
                System.out.println("0");
            }else{
                for(int i=0; i<n; i+=2){
                    xor^=Arr[i];
                }
                System.out.println(xor);
            }
        }
    }
}
