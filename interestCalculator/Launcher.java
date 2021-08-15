import java.util.Scanner;

class Launcher {
	
	Account acc;
    int option;
    double interest;
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Launcher mLauncher = new Launcher();
		 mLauncher.mainMenu(scan);
	}
	
	 void mainMenu(Scanner scan)
	{
		System.out.println("!! MAIN MENU !!");
		System.out.println("Select the type of your Bank Account");
		System.out.println("1. FD Account");
		System.out.println("2. SB Account");
		System.out.println("3. RD Account");
		System.out.println("4. Exit from Main Menu");
		
		
		option = scan.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("You are in FD Account Area");
			 acc = new FDAccount();
			 interest = acc.calculateInterest(scan);
			 System.out.println("Calculated Interest = " + interest);
			 mainMenu(scan);
			break;
		case 2:
			System.out.println("You are in SB Account Area");
		    acc = new SBAccount();
		    interest = acc.calculateInterest(scan);
			System.out.println("Calculated Interest = " + interest);
			 mainMenu(scan);
			break;
		case 3:
			System.out.println("You are in RD Account Area");
			acc = new RDAccount();
			interest = acc.calculateInterest(scan);
			System.out.println("Calculated Interest = " + interest);
			 mainMenu(scan);
			break;
		case 4:
			System.out.println("Exiting....");
			break;
		default:
			System.out.println("Invalid Choice");
			 mainMenu(scan);
		}
	}
}
