import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        HashMap map = new HashMap();
        
        for(int i=0; i<n; i++){
        
            String str = scanner.next();
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                map.replace(str, map.get(str), (int)map.get(str)+1);
            }
        }
        
        int q = scanner.nextInt();
        
        for(int i=0; i<q; i++){
            String str = scanner.next();
            if(!map.containsKey(str)){
                System.out.println("0");
            }else{
                System.out.println(map.get(str));                
            }
        }
    }
}