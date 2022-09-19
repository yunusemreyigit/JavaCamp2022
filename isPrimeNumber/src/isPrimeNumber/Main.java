package isPrimeNumber;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		boolean isPrime = true;
		
		
		if(number == 1)
		{
			isPrime = false;
		}
		for (int i = 2; i < number; i++) {
			if(number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println( number +" is prime number.");
		else
			System.out.println( number +" is not prime number.");
	}

}
