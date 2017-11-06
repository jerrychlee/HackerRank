import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        SortedSet<Integer> set = new  TreeSet<>();
        
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();        
        for(int i=0; i<Q; i++){
            int t = scanner.nextInt();
            switch(t){
                case 1:
                    int n = scanner.nextInt();
                    set.add(n);
                    break;
                case 2:
                    int m = scanner.nextInt();
                    set.remove(m);
                    break;
                case 3:
                    int min = Integer.MAX_VALUE;
                    Iterator<Integer> iter = set.iterator();
                    if (iter.hasNext()) {
                        int num = iter.next();
                        if(num < min)
                            min = num;
                    }
                    System.out.println(min);
                    break;
                default:
                    // do nothing!
                    break;
            }            
        }
        
        scanner.close();
    }
}