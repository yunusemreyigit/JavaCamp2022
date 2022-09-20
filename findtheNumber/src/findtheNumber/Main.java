package findtheNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = {1,5,7,0,16,345,346,75};
		int number = 7;
		
		for (int i = 0; i < numbers.length; i++) {
			if(i == number)
			{
				System.out.println(number + " is in the array");
				return;
			}
		}
		
		System.out.println("I couldn't find it.");
	}

}
