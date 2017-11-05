import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String S="";
        Scanner in = new Scanner(System.in);
        Stack<Node> stk = new Stack();
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int type = in.nextInt();
            switch(type){
                case 1:
                    String str = in.next();
                    in.nextLine();
                    stk.push(new Node(type,str));
                    S = S.concat(str);
                    break;
                case 2:
                    int k = in.nextInt();
                    stk.push(new Node(type,S.substring(S.length()-k,S.length())));
                    S = S.substring(0, S.length()-k);
                    break;
                case 3:
                    int m = in.nextInt();
                    System.out.println(S.charAt(m-1));
                    break;
                case 4:
                    if(!stk.empty()){
                        Node node = stk.pop();
                        if(node.type==1){
                            S = S.substring(0, S.length()-node.str.length());
                        }else if(node.type==2){
                            S = S.concat(node.str);
                        }
                    }
                    break;
                default:
                    break;
            }
            
        }
        in.close();
    }
}

class Node{
    public int type;
    public String str;
    Node(int type, String string){
        this.type = type;
        this.str = string;
    }
}

