import java.util.Scanner;

class Student {
    
    int roll;
    String name;
    float cgpa;

    Student(int r, String n, float c) {
        this.roll = r;
        this.name = n;
        this.cgpa = c;
    }

    float getCgpa() {
        return this.cgpa;
    }
}

 class StudentClass {
    public static void main(String[] args) {

        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        size = sc.nextInt();
        Student[] s_array = new Student[size];

        for (int i = 0; i < size; i++) {
            int roll = 0;
            String name = "";
            float cgpa = 0.0f;

            System.out.print("Enter roll number:");
            roll = sc.nextInt();
            System.out.print("Enter name:");
            name = sc.next();
            System.out.print("Enter cgpa:");
            cgpa = sc.nextFloat();

            Student stu = new Student(roll, name, cgpa);
            s_array[i] = stu;
        }


        Student temp;

        for (int i = 0; i < s_array.length; i++) {
            for (int j = 1; j < s_array.length - 1; j++) {
                if (s_array[j - 1].cgpa > s_array[j].cgpa) {
                    temp = s_array[j - 1];
                    s_array[j - 1] = s_array[j];
                    s_array[j] = temp;
                }
            }
        }

        System.out.println("Student with lowest CGPA: " + s_array[0].name);

        sc.close();
    }

}
