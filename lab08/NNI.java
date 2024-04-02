//Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number.

package lab08;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException(String s) {
        super(s);
    }
}

public class NNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
    }

    public static void ProcessInput(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative number entered");
        } else {
            System.out.println("Double value of the entered number: " + (2 * num));
        }
    }
}