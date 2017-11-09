import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int m = in.nextInt();
            int n = in.nextInt();
            ArrayList<Node> array = new ArrayList();
            for(int j=1; j<=n;j++){
                array.add(new Node(j,in.nextInt()));
            }

            Collections.sort(array, new compare());
            
            //debug
            //for(int k=0;k<array.size();k++)
            //    System.out.print(array.get(k).cost+" ");
            //System.out.println(" ");
            
            int low = 0;
            int high = array.size()-1;
            
            while(low!=high){
                if((array.get(low).cost+array.get(high).cost)>m){
                    high--;
                }else if((array.get(low).cost+array.get(high).cost)<m){
                    low++;                    
                }else{
                    int i1 = array.get(low).index;
                    int i2 = array.get(high).index;
                    System.out.print((i1 < i2)?(i1+" "+i2+"\n"):(i2+" "+i1+"\n")); 
                    break;
                }               
            }
            
        }
    }

    public static class compare implements Comparator
    {
        public int compare(Object arg0, Object arg1)
        {
            int n1 = ((Node)arg0).cost;
            int n2 = ((Node)arg1).cost;
            
            if(n1<n2){
                return -1;                
            }else if(n1>n2){
                return 1;
            }else{
                return 0;
            }
        }
    }
    
    static public class Node{
        int index;
        int cost;
        Node(int i, int c){
            index = i;
            cost = c;
        }
    }
}