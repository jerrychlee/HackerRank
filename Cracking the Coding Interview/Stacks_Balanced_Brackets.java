import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static HashMap<Character, Character> map = new HashMap();
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stk = new Stack();
        
        if(expression==null || expression.length()==0 | expression.length()%2!=0)
            return false;
        
        for(Character c: expression.toCharArray()){
            switch(c){
                case '{':       
                case '[':       
                case '(':       
                    stk.push(c);
                    break;
                case '}':       
                case ']':       
                case ')':       
                    if(stk.empty() || stk.peek()!=map.get(c)){
                        return false;
                    }
                    stk.pop();
                    break;
                default:
                    return false;
            }
        }

        return stk.empty();   
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
