/*Fixed Deposit Account*/

import java.util.Scanner;

class FDAccount extends Account {
    
	int option;
	double generalIR;
	double seniorCitizenIR;
	
	@Override
	double calculateInterest(Scanner scan) {
		// TODO Auto-generated method stub
		setACHolderDetails(scan);
		if(amount<10000000)
		{
			amountBelow1Crore(scan);
			if(age>50)
			{
				interestRate = seniorCitizenIR;
			}
			else
			{
				interestRate = generalIR;
			}
		}
		else
		{
			amountAbove1Crore(scan);
		}
		return amount*interestRate;
	}
	void amountAbove1Crore(Scanner scan)
	{
		System.out.println("Select Maturity Period");
		System.out.println("1. 7-14 days");
		System.out.println("2. 15-29 days");
		System.out.println("3. 30-45 days");
		System.out.println("4. 45-60 days");
		System.out.println("5. 61-129 days");
		System.out.println("6. 185 days-1 year");
		option = scan.nextInt();
	    switch(option)
	    {
	    case 1:
	    	System.out.println("7-14 days Maturity Period");
	    	interestRate = 6.50;
	    	break;
	    case 2:
	    	System.out.println("15-29 days Maturity Period");
	    	interestRate = 6.75;
	    	break;
	    case 3:
	    	System.out.println("30-45 days Maturity Period");
	    	interestRate = 6.75;
	    	break;
	    case 4:
	    	System.out.println("45-60 days Maturity Period");
	    	interestRate = 8;
	    	break;
	    case 5:
	    	System.out.println("61-129 days Maturity Period");
	    	interestRate = 8.50;
	    	break;
	    case 6:
	    	System.out.println("185 days-1 year Maturity Period");
	    	interestRate = 10.00;
	    	break;
	    default:
	    	System.out.println("Invalid Choice of Maturity Period");
	    	amountAbove1Crore(scan);
	    }
	}
	void amountBelow1Crore(Scanner scan)
	{
		System.out.println("Select Maturity Period");
		System.out.println("1. 7-14 days");
		System.out.println("2. 15-29 days");
		System.out.println("3. 30-45 days");
		System.out.println("4. 45-60 days");
		System.out.println("5. 61-129 days");
		System.out.println("6. 185 days-1 year");
		option = scan.nextInt();
	    switch(option)
	    {
	    case 1:
	    	System.out.println("7-14 days Maturity Period");
	    	generalIR = 4.50;
	    	seniorCitizenIR = 5.00;	    	
	    	break;
	    case 2:
	    	System.out.println("15-29 days Maturity Period");
	    	generalIR = 4.75;
	    	seniorCitizenIR = 5.25 ;	 
	    	break;
	    case 3:
	    	System.out.println("30-45 days Maturity Period");
	    	generalIR = 5.50;
	    	seniorCitizenIR = 6.00 ;	 
	    	break;
	    case 4:
	    	System.out.println("45-60 days Maturity Period");
	    	generalIR = 7 ;
	    	seniorCitizenIR = 7.50 ;	 
	    	break;
	    case 5:
	    	System.out.println("61-129 days Maturity Period");
	    	generalIR = 7.50;
	    	seniorCitizenIR = 8.00;	 
	    	break;
	    case 6:
	    	System.out.println("185 days-1 year Maturity Period");
	    	generalIR = 8.00;
	    	seniorCitizenIR = 8.50;	 
	    	break;
	    default:
	    	System.out.println("Invalid Choice of Maturity Period");
	    	amountBelow1Crore(scan);
	    }
	}
	
   

}
