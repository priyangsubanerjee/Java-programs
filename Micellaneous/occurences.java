package Micellaneous;
import java.util.HashMap;
import java.util.Map;

class occurences {
    public static void main(String[] args) {

        // String = 'adddddf'.split("");

        // array 1 = ['a', 'b', 'c', 'd']
        // array 2 = [0, 2, 3, 4]

        String str = "adddddf";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        char[] arr = str.toCharArray();

        for (char i : arr) {

            if (map.containsKey(i)) {

                map.put(i, map.get(i) + 1);

            } else {

                map.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {

            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
}