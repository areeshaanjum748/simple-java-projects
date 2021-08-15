import java.util.Scanner;

class Launcher {
	int casem;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		Launcher mLauncher = new Launcher();
		VideoStore mVideoStore = new VideoStore();
		
		mLauncher.mainMenu(mScanner,mLauncher,mVideoStore);
		

	}
	void mainMenu(Scanner mScanner,Launcher mLauncher,VideoStore mVideoStore)
	{
		System.out.println("!! MAIN MENU !!");
		System.out.println("1. I am an Ownwer");
		System.out.println("2. I am a Customer");
		System.out.println("3. Exit");
		
		casem = mScanner.nextInt();
		
		switch(casem)
		{
		case 1:
			System.out.println("You are in Ownwer area");
			mLauncher.ownerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 2:
			System.out.println("You are in Customer area");
			mLauncher.customerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 3:
			System.out.println("Exiting.......");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	void ownerMenu(Scanner mScanner,Launcher mLauncher,VideoStore mVideoStore)
	{
		System.out.println("OWNER MENU");
		System.out.println("1. Add Video");
		System.out.println("2. List Inventory");
		System.out.println("3. Return video back");
		System.out.println("4. Get back to Main Menu");
		System.out.println("5. Exit");
		
		casem = mScanner.nextInt();
		switch(casem)
		{
		case 1:
			System.out.println("You are in Ownwer's Add Video Area");
			mVideoStore.addVideo(mScanner);
			mLauncher.ownerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 2:
			System.out.println("You are in Ownwer's List Inventory Area");
			mVideoStore.ListInventory(mScanner);
			mLauncher.ownerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 3:
			System.out.println("You are in Ownwer's Return Video Area");
			mVideoStore.returnBack(mScanner);
			mLauncher.ownerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 4:
			mLauncher.mainMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 5:
			System.out.println("Exiting.......");
			System.exit(0);
			
		}
	}
	void customerMenu(Scanner mScanner,Launcher mLauncher,VideoStore mVideoStore)
	{
		System.out.println("CUSTOMER MENU");
		System.out.println("1. Take Video on rent");
		System.out.println("2. List Inventory");
		System.out.println("3. Provide ratings");
		System.out.println("4. Get back to Main Menu");
		System.out.println("5. Exit");
		
		casem = mScanner.nextInt();
		switch(casem)
		{
		case 1:
			System.out.println("You are in Customer's Take Video on Rent Area");
			mVideoStore.takeVideo(mScanner);
			mLauncher.customerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 2:
			System.out.println("You are in Customer's List Inventory Area");
			mVideoStore.ListInventory(mScanner);
			mLauncher.customerMenu(mScanner,mLauncher,mVideoStore);
		case 3:
			System.out.println("You are in Customer's Provide Ratings Area");
			mVideoStore.provideRatings(mScanner);
			mLauncher.customerMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 4:
			mLauncher.mainMenu(mScanner,mLauncher,mVideoStore);
			break;
		case 5:
			System.out.println("Exiting.......");
			System.exit(0);
		}
	}


}
