package Micellaneous;
public class loop {
    
        public static void main(String[] args) {

        int num = 5;

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < i; j++) {
                
                System.out.print("# ");
            }
            
            System.out.println();
        }
   }
 
}
/**
 * 
 * File name = tree.java

Q. I want to print a tree like structure consisting of 
   5 rows and 5 columns aligned towards left but in the 
   output its just 4 rows and 4 columns ! Guess whats wrong ?

   * Note: the value of num cannot be modified.
 
Output:

# 
# # 
# # # 
# # # # 


 */