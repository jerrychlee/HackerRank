import java.io.*;
import java.util.*;

//1 x  -Push the element x into the stack.
//2    -Delete the element present at the top of the stack.
//3    -Print the maximum element in the stack.

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Stack s = new Stack();
        Stack maxStack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0;i<n;i++){
            int type = scanner.nextInt();
            int element=0;
            switch(type)
            {
                case 1:
                    element = scanner.nextInt();
                    s.push(element);
                    if(maxStack.empty() || (!maxStack.empty() && element>=(int)maxStack.peek()))
                        maxStack.push(element);
                    break;
                    
                case 2:
                    element = (int)s.pop();
                    if(!maxStack.empty() && element==(int)maxStack.peek())
                        maxStack.pop();
                    break;
                    
                case 3:
                    if(!maxStack.empty())
                        System.out.println(maxStack.peek());
                    break;
                    
                default:
                    break;
            }
            
        }
        
    }
}
