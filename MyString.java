

public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String resultString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding the difference between 'a' and 'A'
                resultString += ((char) (ch + ('a' - 'A')));
            } else {
                // If not uppercase, append the character as is
                resultString += (ch);
            }
        }
        return resultString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        String str2Substring = str2; 
        String firstString = str1;
        for (int i = 0; i < str2.length(); i++){
            for (int j = 0; j < firstString.length(); j++){
                if (firstString.charAt(j) == ' ' ){
                    break;
                }
                if (str2.charAt(i) == firstString.charAt(j)){
                    // deleting the first letter in the string and breaking the for loop:
                    str2Substring = str2Substring.substring(1);
                    break;
                }
            
            }
        }
        return (str2Substring.isEmpty());
    }
}
