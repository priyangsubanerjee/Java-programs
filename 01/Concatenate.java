import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1, name2 = "";
        System.out.print("Enter first name: ");
        name1 = sc.nextLine();
        System.out.print("Enter last name: ");
        name2 = sc.nextLine();
        sc.close();
        System.out.println(name2 + " " + name1);
    }
}
