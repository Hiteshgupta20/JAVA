package oops;

import java.util.*;

class Cylinder {
    int radius, height, volume;

    Cylinder(int r, int h) {
        this.radius = r;
        this.height = h;
    }

    public int CylVolume() {
        return (int) (Math.PI * Math.pow(this.radius, 2) * this.height);
    }
}

class Circle1 extends Cylinder {
    Circle1(int r, int h) {
        super(r, h);
    }

    public int cirVolume() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }
}

// main class
public class cyl_circle_volume {
    public static void main(String[] args) {
        // scanner for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height");
        int r = sc.nextInt();
        int h = sc.nextInt();
        // Insantiating new object
        Circle1 obj = new Circle1(r, h);
        // getting results
        System.out.println("Volume of Cylinder : " + obj.CylVolume());
        System.out.println("Volume of Circle : " + obj.cirVolume());
        sc.close();
    }
}
