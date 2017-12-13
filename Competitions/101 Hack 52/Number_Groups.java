/****************************/
/* Version 1                */
/****************************/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        long z = k;
        return z*z*z;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}

/****************************/
/* Version 2                */
/****************************/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static long sumOfGroup(int k) {
        // Return the sum of the elements of the k'th group.
        long i = k;
        long numStart = i*(i-1)+1;
        long numEnd = numStart + 2*(i-1);
        
        return (numStart+numEnd)*i/2;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        long answer = sumOfGroup(k);
        System.out.println(answer);
        in.close();
    }
}