/*Savings Bank Account*/
import java.util.Scanner;

class SBAccount extends Account {
	
	int option;
    
	
	@Override
	double calculateInterest(Scanner scan) {
		// TODO Auto-generated method stub
		setACHolderDetails(scan);
		System.out.println("Select the type of your Bank Account");
		System.out.println("1. Normal");
		System.out.println("2. NRI");
	    option = scan.nextInt();
	    switch(option)
	    {
	    case 1:
	    	System.out.println("Normal Account Area");
	    	interestRate = 0.04;
	    	break;
	    case 2:
	    	System.out.println("NRI Account Area");
	    	interestRate = 0.06;
	    	break;
	    default:
	    	System.out.println("Invalid Input");
	    	calculateInterest(scan);
	    }
		return (amount + amount*interestRate);
	}
	

}
