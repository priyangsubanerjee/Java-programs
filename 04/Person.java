import java.util.Scanner;

class Account {
    int acc_no;
    int balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        this.acc_no = sc.nextInt();
        System.out.print("Enter balance: ");
        this.balance = sc.nextInt();
        sc.close();
    }

    void display() {
        System.out.println("Account number: " + this.acc_no);
        System.out.println("Balance: " + this.balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.next();
        System.out.print("Enter aadhar number: ");
        this.aadhar_no = sc.nextInt();
        super.input();
        this.acc_no = super.acc_no;
        this.balance = super.balance;
        sc.close();
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Aadhar number: " + this.aadhar_no);
        super.display();
    }


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input();

        System.out.println("----\n\n");

        p1.display();
    }
}
