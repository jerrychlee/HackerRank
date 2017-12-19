import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        HashMap<String, Integer> map = new HashMap();
        for(String s:magazine){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s, 1);                
            }
        }

        for(String s:ransom){
            int val = map.getOrDefault(s, 0);
            if(val==0){
                System.out.println("No");
                return; 
            }else{
                if(val==1){
                    map.remove(s);
                }else{
                    map.put(s, val-1);
                }
            }
        }
        
        System.out.println("Yes");
    }
}
