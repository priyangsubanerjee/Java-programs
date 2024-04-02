import java.util.Scanner;

public class SumOfDiagnols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lSum = 0;
        int rSum = 0;
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter elem: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < 3; i++) {
            lSum = lSum + matrix[i][i];
        }

        for (int i = 0; i < 3; i++) {
            rSum = rSum + matrix[i][2 - i];
        }

        System.out.println(lSum + " " +rSum);
    }    
}
