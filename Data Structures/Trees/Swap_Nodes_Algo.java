/* Hackerrank Tree - Swap Nodes */
/* Author: CH Lee               */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Queue q = new LinkedList();
        Node head = new Node();
        head.data = 1;
        head.depth = 1;
        q.add(head);
        
        for(int i=0; i<size; i++){
             
            Node n = (Node)q.remove();
            Node item = null;
            int in = 0;
            
            //add left node
            item = new Node();
            in = scanner.nextInt();
            if(in!=-1){
                item.data = in;
                item.depth = n.depth+1;
                n.left = item;            
                //add to queue
                q.add(item);
            }
            
            //add right node            
            item = new Node();
            in = scanner.nextInt();
            if(in!=-1){
                item.data = in;
                item.depth = n.depth+1;
                n.right = item;            
                //add to queue
                q.add(item);
            }
            
        }
        
        int t = scanner.nextInt();
        
        for(int i=0; i<t; i++){
            int depth = scanner.nextInt();
            switchNode(head, depth);
            
            inOrderListOut(head);
            System.out.println(" ");
        }
    }
    
    static class Node{
        int data;
        Node left;
        Node right;
        int depth;
    } 

    public static void switchNode(Node head, int depth){

        if(head == null)
            return;
        
        if(head.depth%depth==0){
            Node temp = head.right;
            head.right = head.left;
            head.left = temp;
        }
        
        if(head.left != null)
            switchNode(head.left, depth);
        if(head.right != null)
            switchNode(head.right, depth);
    }
    
    public static void inOrderListOut(Node head) {
        
        if(head == null)
            return;
        
        inOrderListOut(head.left);
        
        System.out.print(head.data + " ");

        inOrderListOut(head.right);
        
    }

}