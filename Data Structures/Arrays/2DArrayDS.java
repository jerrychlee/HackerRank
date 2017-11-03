import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int [][]array = new int[6][6];
        
        for(int i=0; i<6; i++)
            for(int j=0; j<6; j++){
                array[i][j] = scanner.nextInt();                
            }
    
        int max = -63;
        
        for(int i=0;i<4;i++){
            for(int j=0; j<4; j++){
                
                max = Math.max(max, array[i][j] + array[i][j+1]
                                  + array[i][j+2] + array[i+1][j+1]
                                  + array[i+2][j] + array[i+2][j+1]
                                  + array[i+2][j+2]);
            }
        }
        System.out.println(max);
    }
}