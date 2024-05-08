/*****************
 * CSC300
 * Drew Kroeger
 * Assignment 2- Big O(n) is the time analysis,due to only one for loop
 ***************/
public class Payroll 
{
	public static final int MAX_EMPLOYEE = 7; //this is the max number of employees allowed in the array.
	public int [] employeeId =  {5658845, 4520125,7895122,6777541,8451277,1302850, 7580489}; 
	public int [] hours = new int[employeeId.length]; //the employeeId.length is so the index of the elements of the arrays are all matching
	public double [] payRate= new double[employeeId.length];
	
	//***************************************************************
	
	//this is a constructor to initialize the other two arrays to zeros
	
	public Payroll() 
	{
		for(int i = 0; i<MAX_EMPLOYEE;i++) {
			hours[i]=0;
			payRate[i]=0.0;
		}
	}
	
	
	
	
	
	/******************************************************************/
	
	// the next three methods are the accessor methods
	
	public int getEmployeeId(int i) 
	{
		return employeeId[i];
	}
	public int getHours(int i) 
	{
		return hours[i];
	}
	public double getPayRate(int i) 
	{
		return payRate[i];
	}//end accessor methods
	//************************************************************************
	
	//the next three methods are the mutator methods
	
	public void setEmployeeId(int i, int temp) 
	{
		this.employeeId[i] = temp;
	}
	public void setHours(int i, int temp) 
	{
		this.hours[i]= temp;
	}
	public void setPayRate(int i,double temp) 
	{
		this.payRate[i]= temp;
	}//end mutator methods
	
	
	/********************************************************************
	 * this method has an id number input/argument,and if that number is found in the employeeId array
	 * the respective index of the pay and hours array are accessed/multiplied to make and return gross pay
	 */
	public double idToPaycheck(int employeeSearch) 
	{
		Double grossPay=0.0;
		for (int i=0; i<MAX_EMPLOYEE;i++) 
		{
			if(employeeId[i] == employeeSearch) 
			{
				grossPay = hours[i]*payRate[i];
				return grossPay;
			}
		}
		return grossPay;		
	}//end IdToPayCheck
}//end Payroll Class
