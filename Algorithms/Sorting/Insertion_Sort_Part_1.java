import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int temp = ar[ar.length-1];
        boolean found = false;
        for(int i=0;i<ar.length-1;i++){
            if(temp < ar[ar.length-2-i]){
                ar[ar.length-1-i] = ar[ar.length-2-i];
            }else{
                ar[ar.length-1-i] = temp;
                found=true;
            }
            printArray(ar);
            if(found)
                break;
        }
        if(!found){
            ar[0] = temp;
            printArray(ar);
        }
    }
    
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
