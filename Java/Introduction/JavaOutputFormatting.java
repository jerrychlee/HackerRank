import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                //name
                String s1=sc.next();
                String str = "";
                int space = 15 - s1.length();
                for(int s=0; s<space; s++){
                    str+=" ";
                }
                    
                //score
                int x = sc.nextInt();
                String zero = "";
                if(x<100 && x>=0){
                    int nlen = String.valueOf(x).length();
                    for(int j=0; j<3-nlen; j++){
                        zero+="0"; 
                    }
                }

                //Complete this line
                System.out.println( s1 + str + zero + x);
                
            }
            System.out.println("================================");

    }
}