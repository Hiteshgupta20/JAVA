//JAVA PROGRAM TO GENERATE RANDOM NUMBER
package javaBasic;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class GenerateRandomNumber {

	public static void main(String[] args) {
		int min=300;
		int max=500;
		
		System.out.println("Random number of type double between "+min +" & "+max);
		
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);		//using Math.random method
		
		double b=Math.random()*(max-min)+min;
		System.out.println(b);
		
		double c=ThreadLocalRandom.current().nextDouble(100,200);
		System.out.println(c);		//using ThreadLocalRandom method
	}

}
