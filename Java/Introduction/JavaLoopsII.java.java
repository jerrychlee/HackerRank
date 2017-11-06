import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int out = a;
            for(int num=0; num<n; num++){
                out+=Math.pow(2,num)*b;
                System.out.print( out + ((num!=n-1) ? " " : "\n"));            
            }
        }
        in.close();
    }
}
