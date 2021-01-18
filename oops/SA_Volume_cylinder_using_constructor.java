package oops;

class cylinder1 {
    private double volume,surfaceArea;
    
    cylinder1(int radius, int height) {
    }

    public double getArea() {
        return surfaceArea;
    }

    public double getvolume() {
        return volume;
    }

    public void setArea(int height, int radius) {
        surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    }

    public void setVolume(int height, int radius) {
        volume = (Math.PI * radius * radius * height);

    }
}

public class SA_Volume_cylinder_using_constructor {
    public static void main(String[] args) {
        cylinder1 c = new cylinder1(10, 20);
        c.setArea(10, 20);
        c.setVolume(20, 20);
        System.out.println("Area of cylinder = " + c.getArea());
        System.out.println("volume of cylinder = " + c.getvolume());
    }
}
