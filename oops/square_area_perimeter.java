package oops;
import java.util.*;
class square {
    private  int area;
   private int perimeter;

    public int get_area() {
        return area;
    }

    public void set_area(int squ_side) {
        area = (int) Math.pow(squ_side, 2);
    }

    public int get_perimeter() {
        return perimeter;
    }

    public void set_perimeter(int squ_side) {
        perimeter = (squ_side * 4);
    }
}

public class square_area_perimeter {
    public static void main(String[] args) {
        //Scanner for input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side");
        int side=sc.nextInt();
        //Insantiating new site
        square site1 = new square();
        //setting attributes
        site1.set_area(side);
        site1.set_perimeter(side);
        //getting attributes
        System.out.println("Area of square = " + site1.get_area());
        System.out.println("Perimeter of square =" + site1.get_perimeter());
        
        sc.close();

    }
}
