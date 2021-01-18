package oops;

class cellPhone{
       public String vibrating(){
        return ("The Phone Is Vibrating");
    }
    public String ringing(){
        return ("The Phone IS Ringing");
    }

}
public class cellphone_class {
    public static void main(String[] args) {
        cellPhone redmi7=new cellPhone();
       System.out.println( redmi7.ringing());
        System.out.println(redmi7.vibrating());
    }
}
