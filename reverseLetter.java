import java.util.Arrays;
import java.util.Scanner;
public class reverseLetter {
	String string;
	
	public reverseLetter() {
		
	}
	
	public static String reverse() {
		//Allows users to input phrase
		System.out.println("Type String Below");
		Scanner data = new Scanner(System.in);
		String string = data.nextLine();
		
		// Splits phrase into array
		String [] array = string.split(" ");
		String r = "";
		
		//Loops through the array of the phrase
		for(int i = 0;i < array.length; i++) {
			String word = array[i];
		//Loops through characters in a string and returns a reverse
			for(int x = word.length()-1; x >= 0; x --) {
				char c = word.charAt(x);
				r = r+c;
				
			}
			r = r + " ";
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseLetter a = new reverseLetter();
		System.out.println(reverse());

		
		

	}

}
