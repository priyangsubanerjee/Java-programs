import java.util.Scanner;

public class SortArrayDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int temp = 0;
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        

        for (int i = 0; i < size; i++) {
           System.out.println(arr[i]);
        }

    }
}
