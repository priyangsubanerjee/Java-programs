import java.util.Scanner;

interface Employee {
    int empId = 0;
    String empName = "";

    void getDetails(int id, String name);
}


interface Manager extends Employee {
    int deptid = 0;
    String deptname = "";

    void getManagerDetails(int id, String name);
}

class EmployeeInterface implements Manager {
    
    public void getDetails(int id, String name) {
        System.out.println("Employee ID: " + id + "\nEmployee Name: " + name);
    }

    public void getManagerDetails(int deptid, String deptname) {
        System.out.println("Department ID: " + deptid + "\nDepartment Name: " + deptname);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the employee id: ");
        int empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the department name: ");
        String depname = sc.nextLine();
        System.out.println("Enter the department id: ");
        int depid = sc.nextInt();

        EmployeeInterface e = new EmployeeInterface();
        e.getDetails(empid, name);
        e.getManagerDetails(depid, depname);
        sc.close();
    }
}

