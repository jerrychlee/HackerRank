import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> map = new HashMap();
        for(int i=0; i< first.length();i++){
            char c = first.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);                
            }
        }

        int count = 0;
        
        for(int i=0; i< second.length();i++){
            char c = second.charAt(i);
            int val = map.getOrDefault(c, 0);
            if(val>1){
                map.put(c, val-1);
            }else{
                if(val==1){
                    map.remove(c);                
                }else{
                    count++;    
                }
            }
        }
        
        for (Object key : map.keySet()) {
            count+=map.get(key);
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
