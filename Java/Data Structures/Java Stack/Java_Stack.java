import java.util.;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      StackCharacter stk = new Stack();
      while (sc.hasNext()) {
          String input=sc.next();
          boolean balacne = true;
          Complete the code
          for(int i=0; iinput.length();i++){
              char c = input.charAt(i);
              if(c=='{'){
                stk.push(c);
              }else if(c=='['){
                stk.push(c);                  
              }else if(c=='('){
                stk.push(c);
              }else if(c==']'){
                if(stk.empty()  stk.peek()!='['){
                  balacne = false;
                  break;                    
                }
                stk.pop();                    
              }else if(c=='}'){
                if(stk.empty()  stk.peek()!='{'){
                  balacne = false;
                  break;                    
                }
                stk.pop();                    
              }else if(c==')'){
                if(stk.empty()  stk.peek()!='('){
                  balacne = false;
                  break;                    
                }
                stk.pop();                    
              }else{
                do nothing!  
              }
          }
          
          if(!stk.empty())
            balacne = false;
          System.out.println(balacnetruefalse);
          stk.clear();
      }
   }
}
