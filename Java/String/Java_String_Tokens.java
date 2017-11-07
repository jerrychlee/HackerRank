import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        s = s.trim();
        if(s.length() > 400000)
            return;
        
        if(s.length()==0){
            System.out.println("0");    
            return;            
        }
        
        String[] out = s.split("[ .,'?!_\\@]+");
        
        System.out.println(out.length);
        for(String e: out)
            System.out.println(e);
        
    }
}
