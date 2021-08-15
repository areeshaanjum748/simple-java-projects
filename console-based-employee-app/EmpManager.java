import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class EmpManager  {
	
	List<Employee> mList = new ArrayList<Employee>();
	List<Employee> mReadList = new ArrayList<Employee>();
	
  
  //Add employees to the employee list
	void addEmployee(Scanner mScan)
	{
		System.out.println("Enter employee id");
		int empId = mScan.nextInt();
		System.out.println("Enter employee name");
		String name = mScan.next();
		System.out.println("Enter employee designation");
		String designation = mScan.next();
		System.out.println("Enter employee salary");
		String salary = mScan.next();
		System.out.println("Enter employee phone");
		String phone = mScan.next();
		
		Employee mEmp = new Employee(empId,name);
		mEmp.setDesignation(designation);
		mEmp.setPhone(phone);
		mEmp.setSalary(salary);
		mList.add(mEmp);
		
		for(Employee item:mList)
		{
			System.out.println("Employee added successfully		" + item.getEmpId() + "   " + item.getName());
		}
		System.out.println("Employee added successfully" + mList);
		
	}
	
  //Writes employee data in a txt file
	void writeData(String fname)
	{
		if(fname!=null && !fname.isEmpty())
		{
			if(mList.size()>0)
			{
				File mFile = new File(fname);
			try {
				    FileOutputStream mFOS = new FileOutputStream(mFile);
					ObjectOutputStream mOOS = new ObjectOutputStream(mFOS);
					mOOS.writeObject(mList);
					mOOS.close();
					   System.out.println("	Writing process is successfully completed");
					   System.out.println(mList.size()+" records were added");
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Add employees to list before writing data ");
			}
		}
		else
		{
			System.out.println("Please provide a file name");
		}
	}
	
  //Reads employee data from the stored txt file
	void readData(String fname)
	{
		if(fname!=null && !fname.isEmpty())
		{
		   File mFile = new File(fname);
		   if(mFile.exists())
		   {
			   try {
				   FileInputStream mFIS = new FileInputStream(mFile);
				   ObjectInputStream mOIS = new ObjectInputStream(mFIS);
				   mReadList = (List<Employee>) mOIS.readObject();
				   mOIS.close();
				   System.out.println("Reading process is successfully completed");
				   System.out.println(mReadList.size()+" records were found");
				}catch(FileNotFoundException e)
			   {
					e.printStackTrace();
			   }catch(IOException e)
			   {
				   e.printStackTrace(); 
			   }catch(ClassNotFoundException e)
			   {
				   e.printStackTrace();
			   }
			   
		   }
		   else
		   {
			   System.out.println("File does not exists!");
		   }
		}
		else
		{
			System.out.println("Please provide a file name");
		}
	}
  
  //Displays employee list
	void displayData()
	{
		System.out.println("Employee Details");
		System.out.println("ID		Name		Designation		Salary per Month		Contact");
		for(Employee item:mReadList)
		{
			System.out.println(" " +item.getEmpId()+ "		" + item.getName()+"		" +item.getDesignation()+"		"+item.getSalary()+"		"+item.getPhone());	
		}
	}

}
