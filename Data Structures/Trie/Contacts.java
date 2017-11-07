import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static TrieNode root = new TrieNode();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int count=0;
        for(int i=0; i<n; i++){
            String s = in.nextLine();
            String []a = s.split(" ");
            if(a[0].compareTo("add")==0){
                insert(a[1]);
                //System.out.println(Arrays.asList(root.children));
            }else if(a[0].compareTo("find")==0){
                System.out.println(search(a[1]));
            }else{
                //do nothing!
            }
        }
        in.close();
    }
    
    static void insert(String s){
        insertResursive(root, s, 0);
    }
    
    static void insertResursive(TrieNode node, String s, int index){
        
        node.count++;
        
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
    
    static int search(String s){
        return searchResursive(root, s, 0);
    }
    
    static int searchResursive(TrieNode node, String s, int index){
        //System.out.println(">> "+Arrays.asList(node.children));
        if(index==s.length()){
            return node.count;
        }
        
        char c = s.charAt(index);
        TrieNode child = node.children.get(c);
        if(child==null){
            return 0;
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

