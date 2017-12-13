import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){
        // Complete this function
        Set<Character> setA = new HashSet();
        Set<Character> setB = new HashSet();
        Set<Character> current = setA; 
        for(int i=0; i<arr.length; i++){
            if(i==0){
                for(int j=0; j<arr[i].length(); j++){
                    setA.add(arr[i].charAt(j));
                }       
                //System.out.println(setA.toString());
            }else{
                if(i%2==1){
                    for(int j=0; j<arr[i].length(); j++){
                        if(setA.contains(arr[i].charAt(j))){
                            setB.add(arr[i].charAt(j));
                        }                    
                    }
                    setA.clear();
                    current = setB;
                }else{
                    for(int j=0; j<arr[i].length(); j++){
                        if(setB.contains(arr[i].charAt(j))){
                            setA.add(arr[i].charAt(j));
                        }                    
                    }
                    setB.clear();
                    current = setA;
                }
            }
        }
        return current.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
