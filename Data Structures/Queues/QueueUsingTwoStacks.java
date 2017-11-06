import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        
        Scanner scan = new Scanner(System.in);        
        int Q = scan.nextInt();
        for(int q=0; q<Q; q++) {
            int t = scan.nextInt();            
            switch(t){
                case 1:
                    int num = scan.nextInt();
                    stack.push(num);
                    if(temp.empty()){
                        while(!stack.empty())
                            temp.push(stack.pop());
                    }
                    break;
                case 2:
                    if(temp.empty()){
                        while(!stack.empty())
                            temp.push(stack.pop());                    
                    }
                    temp.pop();
                    break;
                case 3:
                    if(temp.empty()){
                        while(!stack.empty())
                            temp.push(stack.pop());                    
                    }
                    int n = temp.peek();
                    System.out.println(n + " ");
                    break;
                default:
                    // Do nothing!
                    break;
            }
        }
    }
}