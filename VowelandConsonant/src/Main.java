
public class Main {

	public static void main(String[] args) {
		char letter = 'A';
		
		char[] vowels = {'A','E','I','İ','O','Ö','U','Ü',
						 'a','e','ı','i','o','ö','u','ü'};
		
		for (int i = 0; i < vowels.length; i++) {
			if(letter == vowels[i])
			{
				System.out.println(letter + " is a vowel.");
				return;
			}
		}
		System.out.println(letter + " is not a vowel.");
	}

}
