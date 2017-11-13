import java.io.*;
import java.util.*;

public class Solution {
    
    public static void insertionSortPart2(int[] ar)
    {
        for(int i=1; i<ar.length; i++){
            insertIntoSorted(ar, i+1);
            printArray(ar);
        }
    }
    
    public static void insertIntoSorted(int[] ar, int end) {
        // Fill up this function
        int temp = ar[end-1];
        boolean found = false;
        for(int i=0;i<end-1;i++){
            if(temp < ar[end-2-i]){
                ar[end-1-i] = ar[end-2-i];
            }else{
                ar[end-1-i] = temp;
                found=true;
            }
            
            if(found)
                break;
        }
        
        if(!found){
            ar[0] = temp;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);
        
    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}

