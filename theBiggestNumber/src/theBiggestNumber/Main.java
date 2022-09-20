package theBiggestNumber;

public class Main {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 30;
		int number3 = 10;
		
		int biggestNumber = number1;
		
		if(biggestNumber < number2 )
		{
			biggestNumber = number2;
		}
		if(biggestNumber < number3)
		{
			biggestNumber = number3;
		}
		
		System.out.println("The biggest number : " + biggestNumber);
		
	}

}
