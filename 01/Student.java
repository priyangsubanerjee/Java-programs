// Write a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String[] arr = input.split(",");
        System.out.println("Name: " + arr[0] + "\nRoll No: " + arr[1] + "\nSection: " + arr[2] + "\nBranch: " + arr[3]);
    }
}