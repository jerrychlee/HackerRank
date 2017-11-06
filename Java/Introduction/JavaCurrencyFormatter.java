import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat np;

        np = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + np.format(payment));

        np = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + np.format(payment));

        np = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + np.format(payment));

        np = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + np.format(payment));
        
    }
}
