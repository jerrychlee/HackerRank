import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char d = in.next().charAt(0);
        int x = in.nextInt();
        int y = in.nextInt();
        
        int count = 1;
        int [][] array = new int[n+2][n+2];

        for(int i=0; i<n+2; i++){
            array[0][i]=-1;
            array[n+1][i]=-1;
            array[i][0]=-1;
            array[i][n+1]=-1;
        }

    	array[x+1][y+1] = 1;

        switch(d){
            case 'n':
                gotoN(array, x+1, y+1, count);
                break;
            case 's':
                gotoS(array, x+1, y+1, count);
                break;
            case 'w':
                gotoW(array, x+1, y+1, count);
                break;
            case 'e':
                gotoE(array, x+1, y+1, count);
                break;
            default:
                break;
        }
        
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                System.out.print(array[i][j]+ " "); 
            }
            System.out.println(" ");
        }
        in.close();
    }

    public static void gotoN(int [][] array, int x, int y, int count){
        int curX = x;
        int curY = y;
        if(array[curX-1][curY]==0){
            curX-=1;
            array[curX][curY]=++count;
        }else if(array[curX][curY+1]==0){
            curY+=1;
            array[curX][curY]=++count;
        }else if(array[curX][curY-1]==0){
            curY-=1;
            array[curX][curY]=++count;
        }else if(array[curX+1][curY]==0){
            curX+=1;
            array[curX][curY]=++count;
        }else{
                return;
        }
        
        gotoN(array, curX, curY, count);

    }

    public static void gotoS(int [][] array, int x, int y, int count){
        int curX = x;
        int curY = y;
        if(array[curX+1][curY]==0){
            curX+=1;
            array[curX][curY]=++count;
        }else if(array[curX][curY+1]==0){
            curY+=1;
            array[curX][curY]=++count;
        }else if(array[curX][curY-1]==0){
            curY-=1;
            array[curX][curY]=++count;
        }else if(array[curX-1][curY]==0){
            curX-=1;
            array[curX][curY]=++count;
        }else{
            return;
        }
        
        gotoS(array, curX, curY, count);
    }

    public static void gotoE(int [][] array, int x, int y, int count){
        int curX = x;
        int curY = y;
        if(array[curX][curY+1]==0){
            curY+=1;
            array[curX][curY]=++count;
        }else if(array[curX-1][curY]==0){
            curX-=1;
            array[curX][curY]=++count;
        }else if(array[curX+1][curY]==0){
            curX+=1;
            array[curX][curY]=++count;
        }else if(array[curX][curY-1]==0){
            curY-=1;
            array[curX][curY]=++count;
        }else{
            return;
        }
        
        gotoE(array, curX, curY, count);
    }
    
    public static void gotoW(int [][] array, int x, int y, int count){
        int curX = x;
        int curY = y;
        if(array[curX][curY-1]==0){
            curY-=1;
            array[curX][curY]=++count;
        }else if(array[curX-1][curY]==0){
            curX-=1;
            array[curX][curY]=++count;
        }else if(array[curX+1][curY]==0){
            curX+=1;
            array[curX][curY]=++count;
        }else if(array[curX][curY+1]==0){
            curY+=1;
            array[curX][curY]=++count;
        }else{
            return;
        }
        gotoW(array, curX, curY, count);
    }
}

