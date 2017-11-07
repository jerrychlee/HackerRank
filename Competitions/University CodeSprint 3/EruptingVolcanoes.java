import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int [][]array = new int[n][n];
            
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int w = in.nextInt();
            // Write Your Code Here
            addVolcanoesEffect(array, n, x, y, w);
        }
        
        int max=0;       
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //System.out.print(array[i][j]+" ");
                
                if(array[i][j]>max)
                    max = array[i][j];
            }
                //System.out.println(" ");
        }
        System.out.println(max);
        in.close();
    }

    public static void addVolcanoesEffect(int [][] array, int n, int x, int y, int w){
        
        array[x][y] += w;
        for(int dist = 1; dist < w; dist++){            
            
            //Top
            for(int i=-dist; i<=dist; i++){
                if(x+i>=0&&x+i<n&&y-dist>=0&&y-dist<n)
                array[x+i][y-dist]+=(w-dist);
            }                
            //Down
            for(int i=-dist; i<=dist; i++){
                if(x+i>=0&&x+i<n&&y+dist>=0&&y+dist<n)
                array[x+i][y+dist]+=(w-dist);
            }                
            //Left
            for(int i=-dist+1; i<=dist-1; i++){
                if(x-dist>=0&&x-dist<n&&y+i>=0&&y+i<n)
                array[x-dist][y+i]+=(w-dist);
            }                
            //Right
            for(int i=-dist+1; i<=dist-1; i++){
                if(x+dist>=0&&x+dist<n&&y+i>=0&&y+i<n)
                array[x+dist][y+i]+=(w-dist);
            }                
        }
    }
}
