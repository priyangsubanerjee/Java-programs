package Micellaneous;
import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
        
        
        Scanner rScanner = new Scanner(System.in); //Read the terminal//

        System.out.println("Enter first numbers: "); //Print output in the terminal//

        //Take input from user * int, double, string//
    
        int first = rScanner.nextInt();

        System.out.println("Enter second number: ");

        int second = rScanner.nextInt();

        System.out.println("Enter operator: ");

        char operator = rScanner.next().charAt(0);

        rScanner.close();


        double result = 0;

        switch(operator){

            case '+':
                result = first + second;
                break;

            case '-':
                result = first-second;

            //** make other cases too */
                
        }

        System.out.println("Result: " + result);
    }
}