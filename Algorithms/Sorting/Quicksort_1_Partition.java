import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] Arr = new int[n];
        for(int i=0; i<n; i++){
            Arr[i] = in.nextInt();
        }
        
        int piv = Arr[0];
        for(int i=0; i<n; i++){
            if(Arr[i]<piv)
                System.out.print(Arr[i]+" ");
        }
        for(int i=0; i<n; i++){
            if(Arr[i]==piv)
                System.out.print(Arr[i]+" ");
        }
        for(int i=0; i<n; i++){
            if(Arr[i]>piv)
                System.out.print(Arr[i]+" ");
        }
        in.close();
    }
}
