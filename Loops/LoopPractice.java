package practice.loop;

public class LoopPractice {

	public static void main(String[] args) {

		int count =0;
		while (count <=100) {
			System.out.println("hitesh " + count);
			count = count+1;
			
			if(count==50) {
				break;
			}
		}
	}

}
