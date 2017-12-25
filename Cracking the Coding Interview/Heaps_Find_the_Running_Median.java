import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void addNumber(int num, PriorityQueue<Integer> lo, PriorityQueue<Integer> hi) {
        if(lo.size()==0 || num<=lo.peek()){
            lo.add(num);
        }else{
            hi.add(num);
        }        
    }

    public static void balance(PriorityQueue<Integer> lo, PriorityQueue<Integer> hi) {
        PriorityQueue<Integer> big = lo.size()>hi.size()? lo:hi;    
        PriorityQueue<Integer> small = lo.size()>hi.size()? hi:lo;
        
        if(big.size()-small.size()>=2){
            small.add(big.poll());
        }
    }

    public static double getMedian(PriorityQueue<Integer> lo, PriorityQueue<Integer> hi) {
        PriorityQueue<Integer> big = lo.size()>hi.size()? lo:hi;    
        PriorityQueue<Integer> small = lo.size()>hi.size()? hi:lo;
        if(big.size()==small.size()){
            return ((double)big.peek() + small.peek())/2;
        }else{
            return big.peek();
        }        
    }
    
    public static double[] getMedians(int[] array) {
        PriorityQueue<Integer> lo = new PriorityQueue<Integer>( new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return (0-a.compareTo(b));
            }
        } );
        PriorityQueue<Integer> hi = new PriorityQueue<Integer>();
        double [] medians = new double[array.length];
        for(int i=0; i<array.length; i++){
            addNumber(array[i], lo, hi);
            balance(lo, hi);
            medians[i] = getMedian(lo, hi);
        }
        return medians;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        double d[] = getMedians(a);
        for(double e:d){
            System.out.println(e);
        }
    }
}
