import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T>{
    Stack<T> s1;
    Stack<T> s2;    
    public MyQueue(){
        s1 = new<T> Stack();
        s2 = new<T> Stack();        
    }
    
    public void enqueue(T obj){
        s1.push(obj);    
    } 
    
    public  void dequeue(){
        if(s2.empty()){
            while(s1.empty()!=true){
                s2.push(s1.pop());    
            }                        
        }
        s2.pop();
    } 

    public T peek(){
        if(s2.empty()){
            while(s1.empty()!=true){
                s2.push(s1.pop());    
            }        
        }
        return s2.peek();
    }    
}

