import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
      
        List<ArrayList<Integer>> sequences = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<n; i++){
            ArrayList<Integer> sequence = new ArrayList<Integer>();
            sequences.add(sequence);
        }
        
        int lastAnswer = 0;
 
        for(int i=0; i<q; i++){
            int t = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            List<Integer> sequence = sequences.get((x^lastAnswer)%n);
                
            switch(t){
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastAnswer = sequence.get(y%sequence.size());
                    System.out.println(lastAnswer);
                    break;
                default:
                    //do nothing
                    break;
            }
        }
    }
}