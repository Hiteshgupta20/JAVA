package methods;

import java.util.*;
public class sum_of_naturalNo_using_recursion {
    static int sumRec(int n){
        if(n==1)
            return 1;

        return n + (sumRec(n-1));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n");
        int c= sc.nextInt();
        System.out.println(sumRec(c));
        sc.close();
    }
}

