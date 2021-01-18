package methods;

public class frequency {

    public static void main(String[] args) {
        String str1 = "Hitesh gupta";
        str1 = str1.toLowerCase();
        int[] frq = new int[str1.length()];

        char string[] = str1.toCharArray();

        for (int i = 0; i < string.length; i++) {
            frq[i] = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    frq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for (int i = 0; i < frq.length; i++) {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + frq[i]);
        }
    }
}
