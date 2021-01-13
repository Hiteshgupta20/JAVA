/* avg_of_numbers_using_arguments*/
public class avg_of_numbers_using_arguments {

    static double average(int... n) {
        double avg = 0, result;
        for (int i : n) {
            avg = (avg + i);

        }
        return result = avg / n.length;
    }

    public static void main(String[] args) {
        System.out.println(average(3, 5, 7, 10, 522, 564, 478));
    }
}