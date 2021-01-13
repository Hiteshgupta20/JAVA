package Conditional_Statement;
import java.util.Scanner;

public class week_day {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the number");
		int day=sc.nextInt();
		
		System.out.println(getDayName(day));
		}
	//get the name of weeks
	public static String getDayName(int day) {
		String dayName="";
		switch(day) {
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName= "Wednesday"; break;
		case 4: dayName= "Thrusday"; break;
		case 5: dayName= "Friday"; break;
		case 6: dayName= "Saturday"; break;
		case 7: dayName= "Sunday"; break;
		default : dayName="Invalid range of day";break;
		}
		return dayName;
			
		}
	}


