package theBiggestNumber;

public class Main {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 30;
		int number3 = 10;
		
		int biggesetNumber = number1;
		
		if(biggesetNumber < number2 )
		{
			biggesetNumber = number2;
		}
		if(biggesetNumber < number3)
		{
			biggesetNumber = number3;
		}
		
		System.out.println("The biggest number : " + biggesetNumber);
		
	}

}
