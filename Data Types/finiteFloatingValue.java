/*Program to test whether a given double value is a finite floating-point value or not.
 * 
 */
package dataTypes;
import java.util.*;
public class finiteFloatingValue {

	public static void main(String[] args) {
		Double dn1=	0.2534564d;
		boolean d1f=Double.isFinite(dn1);
		Double dn2= dn1/0;
		boolean d2f=Double.isFinite(dn2);
		Double dn3=Double.POSITIVE_INFINITY*0;
		boolean d3f=Double.isFinite(dn3);
		
		System.out.println("\n Finite doubles\n-------");
		System.out.println("IS "+dn1 +" is finite ? "+d1f);
		System.out.println("IS "+dn2 +" is finite ? "+d2f);
		System.out.println("IS "+dn3 +" is finite ? "+d3f);
	}
}
