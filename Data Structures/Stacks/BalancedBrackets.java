import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String isBalanced(String s) {
        // Complete this function
        String YES = "YES";
        String NO = "NO";
        
        if(s==null)
            return YES;
        
        Stack stk = new Stack();
        for(int i=0; i<s.length(); i++){
            
            char c = s.charAt(i);
            
            if((c=='{')||(c=='[')||(c=='(')){
                stk.push(c);
            }else if(c=='}'){
                if(stk.empty()||(char)stk.pop()!='{')
                    return NO;
            }else if(c==']'){
                if(stk.empty()||(char)stk.pop()!='[')
                    return NO;
            }else if(c==')'){
                if(stk.empty()||(char)stk.pop()!='(')
                    return NO;
            }
        }
        
        if(stk.empty())
            return YES;
        
        return NO;
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}

