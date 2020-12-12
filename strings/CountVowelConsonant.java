package strings;

public class CountVowelConsonant {

	public static void main(String[] args) {
		
		int vCount=0,cCount=-0;
		
		//Declare the string
		String str= "Hitesh gupta";
		
		//Converting the string to lowercase to reduce the 	comparison
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			//check whether a character is vowel
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u') {
			//Increments the vowel counter 
			vCount++;	
			}
			
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			//Increments the consonant counter 
			cCount++;
			}
		}
				
		System.out.println("Number of vowels " +vCount );
		System.out.println("Number of consonants " +cCount);
				
		
	}

}
