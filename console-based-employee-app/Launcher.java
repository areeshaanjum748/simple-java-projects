import java.util.Scanner;

class Launcher {

	Scanner mScan = new Scanner(System.in);
	int option;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher mLaunch = new Launcher();
		EmpManager mEmpMng = new EmpManager();
		mLaunch.mainMenu(mLaunch,mEmpMng);

	}
	
	void mainMenu(Launcher mLaunch,EmpManager mEmpMng)
	{
		System.out.println("!--------------MAIN   MENU---------------!");
		System.out.println("1. Add Employee ");
		System.out.println("2. Write Employee details ");
		System.out.println("3. Read Employee details ");
		System.out.println("4. Display Employee details ");
		System.out.println("5. Exit ");
		
		option = mScan.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("You are in Add Employee Area");
			mEmpMng.addEmployee(mScan);
			mLaunch.mainMenu(mLaunch,mEmpMng);
			break;
		case 2:
			System.out.println("You are in Write Employee details Area");
			mEmpMng.writeData("Exp4.txt");
			mLaunch.mainMenu(mLaunch,mEmpMng);
			break;
		case 3:
			System.out.println("You are in Read Employee details Area");
			mEmpMng.readData("EmployeeData.txt");
			mLaunch.mainMenu(mLaunch,mEmpMng);
			break;
		case 4:
			System.out.println("You are in Display Employee details Area");
			mEmpMng.displayData();
			mLaunch.mainMenu(mLaunch,mEmpMng);
			break;
		case 5:
			System.out.println("Exiting...");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Input");
			mLaunch.mainMenu(mLaunch,mEmpMng);
		}
		

		
	}

}
