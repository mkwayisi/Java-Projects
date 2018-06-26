/*
 * Mark Kwayisi
 */
public class Employee extends SimplePerson // Causes the Employee to embody the characteristics of the SimplePerson class
{


private double salary; // Sets Up The Double For Salary
private String hireDate; // Sets Up A Hire Date String
private int idNumber; // Sets Up an ID Number

public Employee( )
{
	super( ); // Refers to the first class
	this.name = "no name yet"; // Because the name is unknown.
	salary = 0; // Salary has not been input
	hireDate = "Not hired"; // Employee has not been hired
	idNumber = 0; // Employee does not have an ID number
}

public Employee(String initialName, double initialsalary, String initialhireDate, int initialidNumber)
{
	super(initialName); // Refers to first class
	salary = initialsalary; 
	hireDate = initialhireDate;
	idNumber = initialidNumber;
}
	public String getName() // Recognizes name.
	{
		return this.name;
	}
	public double getSalary() // Recognizes the salary.
	{
		return this.salary;
	}
	public String getHireDate() // Recognizes the start date
	{
		return this.hireDate;
	}
	public int getIdNumber() // Recognized ID Number
	{
		return this.idNumber;
	}
	
	public void setName(String aName) 
	{
		this.name = aName;
	}
	public void setSalary(double aSalary)
	{
		if (aSalary>=0.0)
		{
			this.salary = aSalary;
		}
	}
	public void setHireDate(String aHireDate)
	{
		this.hireDate = aHireDate;
	}
	public void setIdNumber(int aIdNumber)
	{
		if (aIdNumber>0)
		{
			this.idNumber = aIdNumber;
		}
	}
	
	public boolean equals(Employee otherEmployee)
	{
		return this.hasSameName(otherEmployee)&&
				(this.salary == otherEmployee.salary)&&
				(this.hireDate==otherEmployee.getHireDate())&&
				(this.idNumber == otherEmployee.idNumber);
	}
	
	public void writeOutput() // Prints the output .
	{
		System.out.println("Name: " + getName());
		System.out.print("Makes " + salary);
		System.out.println("Was Hired " + getHireDate());
		System.out.println("ID Number is " + idNumber);
	}

}

	


