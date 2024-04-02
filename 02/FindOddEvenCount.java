import java.util.Scanner;

public class FindOddEvenCount {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        sc.close();
        System.out.println("Number of even: " + even );
        System.out.println("Number of odd: " + odd );
    }    
}
