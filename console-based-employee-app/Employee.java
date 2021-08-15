import java.io.Serializable;

class Employee implements Serializable {
	
	int empId;                              //empId - Employee ID
	String name,desg,salary,phone;         //desg - desgination
	
  //Constructor
	Employee(int empId,String name)
	{
		this.empId = empId;
		this.name  = name;
	}	
  
  //Getter and setter methods
	void setEmpId(int empId)
	{
		this.empId = empId;
	}
	int getEmpId()
	{
		return empId;
	}
	void setName(String name)
	{
		this.name  = name;
	}
	String getName()
	{
		return name;
	}
	void setDesignation(String desg)
	{
		this.desg = desg;
	}
	String getDesignation()
	{
		return desg;
	}
	void setSalary(String salary)
	{
		this.salary  = salary;
	}
	String getSalary()
	{
		return salary;
	}
	void setPhone(String phone)
	{
		this.phone  = phone;
	}
	String getPhone()
	{
		return phone;
	}

}
