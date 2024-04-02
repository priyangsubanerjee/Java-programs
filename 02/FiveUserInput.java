import java.util.Scanner;

public class FiveUserInput {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        sc.close();
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + ", ");
        }
    }    
}
