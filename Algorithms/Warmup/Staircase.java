import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for(int i=0; i<n;i++){
            StringBuffer sBuf = new StringBuffer();
            for(int j=0; j<n;j++)
                if(j<(n-i-1))
                    sBuf.append(" ");
                else
                    sBuf.append("#");
            
            System.out.println(sBuf.toString());
        }
    }
}
