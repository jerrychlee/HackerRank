import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap();
        for(int i=0;i<n;i++){
            int key = in.nextInt();
            Object val = (Object)map.get(key);
            map.put(key, (val==null)?1:((int)val+1));
        }

        //debug
        //System.out.println(map);
        TreeSet set = new TreeSet();
        int m = in.nextInt();
        for(int i=0;i<m;i++){
            int key = in.nextInt();
            Object val = (Object)map.get(key);
            if(val==null)
                set.add(key);
            else{                
                if((int)val==1)
                    map.remove(key);
                else
                    map.put(key, (int)val-1);               
            }
        }
        
        if(map.size()>0){
            Set setMap = map.keySet();
            for(Object o:setMap){
                set.add(o);
            }            
        }
        
        for(Object o:set){
            System.out.print((int) o + " ");
        }
    }
}