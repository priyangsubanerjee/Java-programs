package lab6.marketing;


public class sales extends lab6.general.employee{

    public sales(int id, String name) {
        super(id, name);
    }

    public void tallowance(int salary) {
        double earning = earning(salary);
        double TA = 0.05 * salary;
        earning += TA;

        System.out.println("Employee ID: " + empid);
        System.out.println("Earnings: " + earning);
        System.out.println("Travel Allowance: " + TA);
    }
    
}
