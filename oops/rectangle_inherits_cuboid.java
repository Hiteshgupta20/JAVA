package oops;

class rectangle{
    int length, breadth;

    rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int areaRec(){
        return this.length*this.breadth;
    }
}

class cuboid extends rectangle{
    int height;
    cuboid(int l,int b,int h){
        super(l, b);
        this.height=h;
    }

    public int areaCub(){
        return (2*(this.length*this.breadth) + (this.breadth*this.height) + (this.height*this.length));
    }
}
public class rectangle_inherits_cuboid {
    public static void main(String[] args) {
        cuboid obj= new cuboid(10, 4, 6);
        System.out.println("Area of Rectangle : " +obj.areaRec());
        System.out.println("Area of Cuboid : " + obj.areaCub());
    }
}
