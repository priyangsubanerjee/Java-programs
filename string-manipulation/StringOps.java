class StringOps {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello1";
        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());


        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());


        System.out.println(s1.compareTo(s));

        // insert one string to another

        System.out.println(s1.concat(s));

        // Convert the string to upper case and lower case
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //Check whether the character is present in the string and at which position

        System.out.println(s.indexOf('e'));

        // Check whether the string is palindrome or not.

        String s2 = "maam";
        StringBuffer sb1 = new StringBuffer(s2);
        if(s2.equals(sb1.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        

        // Check the number of word, vowel and consonant in the string

        String s3 = "Hello World";
        int wordCount = 1;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == 'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i' || s3.charAt(i) == 'o'
                    || s3.charAt(i) == 'u') {
                vowelCount++;
            } else if (s3.charAt(i) != ' ') {
                consonantCount++;
            }
        }

        
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("Word count: " + wordCount);
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);



    }    
}
