package perfectNumber;

public class Main {

	public static void main(String[] args) {
		// 6 -> 1,2,3
		
		int number = 5;
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0)
				sum += i;
		}
		
		if(sum == number)
			System.out.println(number + " is a perfect number.");
		else
			System.out.println(number + " is not a perfect number.");

	}

}
