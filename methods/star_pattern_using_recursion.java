package methods;
public class star_pattern_using_recursion {
  //method for pattern using recursion
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //method for reverse using recursion
    static void rev_pattern_rec(int k){
        if(k>0){
            for(int j=k;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
            rev_pattern_rec(k-1);
        }
    }
    public static void main(String[] args) {
        pattern_rec(4);
        rev_pattern_rec(5);
    }
}
