package oops;

class circle {
    public int radius;

    circle(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder1 extends circle {
    int height;

    cylinder1(int r, int h) {
        super(r);
        this.height = h;
    }

    public double cylArea() {
        return ((2 * Math.PI * Math.pow(this.radius, 2)) + (2 * Math.PI * this.radius * this.height));
    }
}

public class circle_inherits_cylinder {
    public static void main(String[] args) {
        cylinder1 c = new cylinder1(10, 4);
        System.out.println("Area of Circle : " + Math.round(c.area()));
        // System.out.println(c.cylArea());

    }

}
