package Micellaneous;
import java.util.ArrayList;
import java.util.Collections;

public class sort {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            if(i%2 != 0){

                list.add(0, i);
            }
            else{

                list.add(list.size(), i);
            }
            
        }

        Collections.reverse(list);

        System.out.println(list.toString());
    }
}


/**
 * File name: arrayList.java
 
 Q. Choose the correct output
 
 A. [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 B. [8, 6, 4, 2, 0, 1, 3, 5, 7, 9]
 C. [4, 6, 8, 2, 0, 1, 3, 5, 7, 9]

 */