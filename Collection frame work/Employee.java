import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		int input;
		ArrayList<EmployeePojo> emp=new ArrayList<EmployeePojo>();
		do {
		
			System.out.println("Please enter 1 to enter emploee name and id \n 2 for exit: ");
			 input = new Scanner(System.in).nextInt();
			 
		//switch case what operation You want to perform
		
		switch (input) { 
		case 1:
		
		//set details
		EmployeePojo emp1= new EmployeePojo();
		System.out.println("Enter employee Name");
		emp1.setEmpName(new Scanner(System.in).nextLine());
		System.out.println("Enter employee Id");
		emp1.setId(new Scanner(System.in).nextInt());
		
		
		//add details to arraylist
		emp.add(emp1);
		
		emp1.msg();
		
		break;
		case 2:
		
			//System.exit(0);
	
		
	}
		
		
		}while(input!=2);
		
		
		for(int i=0;i<emp.size();i++)
		{
			
			EmployeePojo data=emp.get(i);
			System.out.println("Employee Name : "+data.getempName());
			System.out.println("Employee Id : "+data.getId());
				
		}
			
		}
		
}
