package Micellaneous;
public class recursion {
    
    public static void main(String[] args) {

      check(5, 4);
       
    }


    static boolean check(int a, int b){

        Boolean boolean1;

        if(a==b){

            boolean1 = true;
            System.out.println("True");
            
        }
        else{

            boolean1 = false;
            System.out.println("False");

            check(a, b+1);
        }


        return boolean1;
    }
}
