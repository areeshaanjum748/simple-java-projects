import java.util.Scanner;

abstract class Account {
	
	double interestRate,amount;
	int age;
	
	abstract double calculateInterest(Scanner scan);
	
	void setACHolderDetails(Scanner scan)
	{
		System.out.println("Enter amount");
		amount = scan.nextDouble();
		if(amount<0)
		{
			System.out.println("Invalid Amount");
		    setACHolderDetails(scan);
		}
		System.out.println("Enter age");
		age = scan.nextInt();
		if(age<0 || age>120)
		{
			System.out.println("Invalid Age");
		    setACHolderDetails(scan);
		}
		
	}
	

}

