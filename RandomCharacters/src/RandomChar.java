import java.util.Arrays;

public class RandomChar {
	
	public static void main(String[] args) {
		char[] randChar = RandomChar.getRandomChar();
		RandomChar.displayChar(randChar);
		
		System.out.println();
		
		int[] countChar = RandomChar.countLetters(randChar);
		RandomChar.displayCountLetters(countChar);
		
		System.out.println();
		
	
	
	}
	// Generate random characters of 100
	public static char[] getRandomChar() {
		char[] charArray = new char[100];
		for(int i = 0; i < charArray.length; i++){
			//charArray[i] = (char)((int)'a' + (int)(Math.random()*(122-97 + 1)));
			charArray[i] = (char)((int)'a' + (int)(Math.random()*((int)'z' - (int)'a' + 1)));
		}
		return charArray;
		
	}
	
	// Display the random characters 20 characters per line
	public static void displayChar(char[] randomChar) {
		for(int i = 0; i < randomChar.length; i++){
			if((i + 1) % 20 == 0){
				System.out.println(randomChar[i]);
			}else {
				System.out.print(randomChar[i] + " ");
			}
		}
	}
	
	
	
	public static int[] countLetters(char[] chars){
		// Declare and create an array of 26 int
		int[] counts = new int[26];
		
		// For each lowercase letter int the array, count it
		for(int i = 0; i < chars.length; i++){
			
			counts[chars[i] - 'a']++;
		}
		
		return counts;
	}
	
	public static void displayCountLetters(int[] counts){
		for(int i = 0; i < counts.length; i++){
			if((i + 1) % 10 == 0){
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			}else {
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
			}
		}
	}
	
	
	
	
	
}
