import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurencesHash {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Enter a string:");
        str = sc.nextLine();
        char[] arr = str.toCharArray();
        sc.close();

        for (char i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }


        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }    
}
