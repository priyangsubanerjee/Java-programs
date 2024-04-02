import java.util.Scanner;

interface EmployeePrint {
    void earnings();
    void deductions();
    void bonus();
}


class Manager implements EmployeePrint {
    
    int salary = 10000;
    double basic = 10000;

    public void earnings() {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        double earning = basic + DA + HRA;

        System.out.println("Earnings: " + earning);
    }

    public void deductions() {
        double PF = 0.12 * basic;
        System.out.println("Deductions: " + PF);
    }

    public void bonus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class SubStaff extends Manager {
    
    SubStaff(int s) {
        salary = s;
    }

    public void bonus(){
        System.out.println("Bonus: " + salary * 0.1);
    }
}

public class Salary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int sal = sc.nextInt();
        SubStaff s = new SubStaff(sal);
        s.earnings();
        s.deductions();
        s.bonus();
        sc.close();
    }
    
}
