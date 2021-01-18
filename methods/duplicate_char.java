/**
 * duplicate_char
 */
package methods;
public class duplicate_char {

    public static void main(String[] args) {
        String str1 = "Hitesh Gupta";
        str1 = str1.toLowerCase();
        char string[] = str1.toCharArray();
        System.out.println("Duplicate char in string");
        for (int i = 0; i < str1.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';

                }
            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}