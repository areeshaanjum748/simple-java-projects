/*Reccurring Deposit Account*/
import java.util.Scanner;

class RDAccount extends Account {
    
	int noOfMonths;
	int option;
	double generalIR;
	double seniorCitizenIR;
	@Override
	double calculateInterest(Scanner scan) {
		// TODO Auto-generated method stub
		setACHolderDetails(scan);
		System.out.println("Select the category from below");
		System.out.println("1. General");
		System.out.println("2. Senior Citizen");
		option = scan.nextInt();
	    switch(option)
	    {
	    case 1:
	    	System.out.println("General Account Area");
	    	System.out.println("Enter Maturity Month");
	    	noOfMonths = scan.nextInt();
	    	maturityPeriod(noOfMonths);
	    	interestRate = generalIR;
	    	break;
	    case 2:
	    	System.out.println("Senior Citizen Account Area");
	    	System.out.println("Enter Maturity Month");
	    	noOfMonths = scan.nextInt();
	    	maturityPeriod(noOfMonths);	
	    	interestRate = seniorCitizenIR;
	    	break;
	    default:
	    	System.out.println("Invalid Input");
	    	calculateInterest(scan);
	    }
		
		return amount*interestRate;
	}
	void maturityPeriod(int noOfMonths)
	{
		switch(noOfMonths)
		{
		case 6:
			generalIR = 7.50;
	    	seniorCitizenIR = 8.00 ;	 
			break;
		case 9:
			generalIR = 7.75;
	    	seniorCitizenIR = 8.25;	 
			break;
		case 12:
			generalIR = 8.00;
	    	seniorCitizenIR = 8.50;	 
			break;
		case 15:
			generalIR = 8.25;
	    	seniorCitizenIR = 8.75;	 
			break;
		case 18:
			generalIR = 8.50;
	    	seniorCitizenIR = 9.00;	 
			break;
		case 21:
			generalIR = 8.75;
	    	seniorCitizenIR = 9.25;	 
			break;
		default:
			System.out.println("Invalid Month Choice");
	    	maturityPeriod(noOfMonths);		
		}
	}
	
	

}
