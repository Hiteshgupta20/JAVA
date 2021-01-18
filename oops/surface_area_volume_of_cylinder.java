package oops;

class cylinder{
    int radius,height;
   double volume,surfaceArea;

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int cyl_radius){
        radius=cyl_radius;
    }    
    public void setHeight(int cyl_height){
        height=cyl_height;
    }  
    
    public double getArea(){
        return surfaceArea;
    }
    public double getvolume(){
        return volume;
    }
    public void setArea(int height,int radius){
        surfaceArea= (2 * Math.PI * Math.pow(radius,2)) + (2 * Math.PI * radius * height);
    }
    public void setVolume(int height,int radius){
        volume=  (Math.PI * radius * radius*height);
        
    }

}
public class surface_area_volume_of_cylinder {
    public static void main(String[] args) {
        cylinder cylinder1=new cylinder();
        cylinder1.setArea(10,20);
        cylinder1.setVolume(20,20);
        System.out.println("Area of cylinder = " + cylinder1.getArea());
        System.out.println("volume of cylinder = " + cylinder1.getvolume());


    }
    
}
