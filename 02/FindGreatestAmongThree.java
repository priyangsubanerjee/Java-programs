import java.util.Scanner;

public class FindGreatestAmongThree {
    public static void main(String[] args) {
        int a, b, c = 0;
        int largest = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        c = sc.nextInt();
        largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println(largest);

        

    }    
}
