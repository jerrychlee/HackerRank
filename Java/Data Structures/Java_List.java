import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List list = new LinkedList();
        for(int i=0; i<n; i++){
            list.add(in.nextInt());
        }    
        int m = in.nextInt();
        for(int j=0;j<m;j++){
            in.nextLine();
            String type = in.nextLine();
            //debug
            //System.out.println("type=" + type);
            if(type.compareTo("Insert")==0){
                int x = in.nextInt();
                int y = in.nextInt();
                list.add(x,y);
            }else if(type.compareTo("Delete")==0){
                int x = in.nextInt();
                list.remove(x);                
            }
        }
        
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
