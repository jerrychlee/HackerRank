import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static Boolean isFound = false;
    static String path = "";
    static int min_count = Integer.MAX_VALUE;
    static List<String> list = new ArrayList();
    
    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        //  Print the distance along with the sequence of moves.
        int [][]array = new int[n][n]; 
            
        dfs(array, n, i_start, j_start, i_end, j_end, 0);
        
        if(isFound){
            System.out.println(min_count);            
            System.out.println(path);                        
        }else{
            System.out.println("Impossible");                    
        }
    }
    
    static void dfs(int [][] a, int n, int i_c, int j_c, int i_e, int j_e, int count){        
        
        
        if(i_c==i_e && j_c==j_e){
            if(count < min_count){
                min_count = count;
                StringBuilder sb = new StringBuilder();
                for(int i=0; i<list.size(); i++){
                    sb.append(list.get(i));
                }
                path = sb.toString();
            }
            isFound = true;
            return;
        }

        if(a[i_c][j_c]==0 || a[i_c][j_c]>count){
            
            a[i_c][j_c] = count;
            
            //UL           
            if(i_c-2>=0 && j_c-1>=0){
                list.add("UL ");
                dfs(a, n, i_c-2, j_c-1, i_e, j_e, count+1);
                list.remove(list.size()-1);
            }
            //UR            
            if(i_c-2>=0 && j_c+1<n){
                list.add("UR ");
                dfs(a, n, i_c-2, j_c+1, i_e, j_e, count+1);
                list.remove(list.size()-1);
            }
            //R            
            if(j_c+2<n){
                list.add("R ");
                dfs(a, n, i_c, j_c+2, i_e, j_e, count+1);
                list.remove(list.size()-1);
            }
            //LR            
            if(i_c+2<n && j_c+1<n){
                list.add("LR ");
                dfs(a, n, i_c+2, j_c+1, i_e, j_e, count+1);
                list.remove(list.size()-1);
            }
            //LL           
            if(i_c+2<n && j_c-1>=0){
                list.add("LL ");
                dfs(a, n, i_c+2, j_c-1, i_e, j_e, count+1);
                list.remove(list.size()-1);
            }
            //L            
            if(j_c-2>=0){
                list.add("L ");
                dfs(a, n, i_c, j_c-2, i_e, j_e, count+1);
                list.remove(list.size()-1);
            }
        }
        return;
    }
         
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i_start = in.nextInt();
        int j_start = in.nextInt();
        int i_end = in.nextInt();
        int j_end = in.nextInt();
        printShortestPath(n, i_start, j_start, i_end, j_end);
        in.close();
    }
}