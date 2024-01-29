package Micellaneous;
import java.util.ArrayList;
import java.util.Collections;

public class factorial {
    
    public static void main(String[] args) {
        
        int num = 5;
        int result = fact(num);
        System.out.println("\nFactorial of " + num + " is " + result);
    }
    
    static int fact(int n) {
        
        if (n == 0) {
            
            return 1;
        }
        
        return n * fact(n - 1);
    }
}
