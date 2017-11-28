import java.io.*;
import java.util.*;

public class Solution {
    
    static int count = 0;
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] array = new int[n][m];
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                count=0;
                findNearby(array , i ,j);
                if(count>max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
    
    public static void findNearby(int[][] arr, int x, int y){
        
        int r = arr.length;
        int c = arr[0].length;
        
        if(arr[x][y]!=0 && arr[x][y]!=2){
            //debug
            //System.out.println(x+" "+y);
            arr[x][y] = 2;
            count++;
            if(x>0){
                findNearby(arr, x-1, y);
            }
            if(y>0){
                findNearby(arr, x, y-1);
            }
            if(x<r-1){
                findNearby(arr, x+1, y);
            }
            if(y<c-1){
                findNearby(arr, x, y+1);
            }
            if(x>0 && y>0){
                findNearby(arr, x-1, y-1);
            }
            if(x>0 && y<c-1){
                findNearby(arr, x-1, y+1);
            }
            if(x<r-1 && y>0){
                findNearby(arr, x+1, y-1);
            }
            if(x<r-1 && y<c-1){
                findNearby(arr, x+1, y+1);
            }
            
        }
    }
}
