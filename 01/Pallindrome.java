import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num, temp, rev = 0;
        num = sc.nextInt();
        sc.close();

        temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
