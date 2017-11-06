import java.io.*;
import java.util.*;

public class Solution {
    
    static TrieNode root = new TrieNode();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int count=0;
        String [] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = in.nextLine();
        }
        
        
        boolean isBad = false;
        for(int j=0; j<n; j++){
            if(!search(s[j])){
                System.out.println("BAD SET");
                System.out.println(s[j]);
                isBad = true;
                break;
            }
            insert(s[j]);
        }
        
        if(!isBad){
            System.out.println("GOOD SET");
        }
        
        
        in.close();
    }
    
    static void insert(String s){
        insertResursive(root, s, 0);
    }
    
    static void insertResursive(TrieNode node, String s, int index){
        
        if(index == s.length()){
            node.endofWords = true;
            return;
        }
        
        TrieNode childNode = node.children.get(s.charAt(index));
        if(childNode == null){
            childNode = new TrieNode();
            node.children.put(s.charAt(index), childNode);
        }
        
        insertResursive(childNode, s, index+1);
    }
    
    static boolean search(String s){
        return searchResursive(root, s, 0);
    }
    
    static boolean searchResursive(TrieNode node, String s, int index){
        
        node.count++;
        if(index==s.length()){
            if(node.endofWords==true)
                return false;
            
            if(node.children.size()>0){
                return false;
            }
            
            return true;
        }
        
        if(node.endofWords==true){
            return false;
        }
        
        char c = s.charAt(index);
        TrieNode child = node.children.get(c);
        if(child==null){
            return true;
        }else{
            return searchResursive(child, s, index+1);
        }
    }
    
    static private class TrieNode{
        Map<Character, TrieNode> children;
        boolean endofWords;
        int count;
        TrieNode(){
            children = new HashMap();
            endofWords = false;
            count = 0;
        }
    }
    
}
