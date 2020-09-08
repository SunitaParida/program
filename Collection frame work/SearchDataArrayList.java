
import java.util.ArrayList;
import java.util.Scanner;

public class SearchDataArrayList {

	public static void main(String[] args) {
		//Array-List
		ArrayList<SearchDataPojo> employee=new ArrayList<SearchDataPojo>();
			
		SearchDataPojo emp=new SearchDataPojo();
		emp.setEmpName("sunita");
		emp.setAddress("koraput");
		emp.setId(1);
		
		SearchDataPojo emp1=new SearchDataPojo();
		emp1.setEmpName("puja");
		emp1.setAddress("bbsr");
		emp1.setId(2);
		
		SearchDataPojo emp2=new SearchDataPojo();
		emp2.setEmpName("b2");
		emp2.setAddress("khorda");
		emp2.setId(3);
		
		//add element to list
		employee.add(emp);
		employee.add(emp1);
		employee.add(emp2);
		
		System.out.println("Enter the employee name that you want to search :" );
		String search=new Scanner(System.in).nextLine();
		
		//search element
		for(int i=0;i<employee.size();i++)
		{
			
			SearchDataPojo data=employee.get(i);
			if(data.getempName().contains(search))
			{
			
			System.out.println("Employee Name : "+data.getempName());
			System.out.println("Employee Address : "+data.getAddress());
			System.out.println("Employee Id : "+data.getId());
				
			}
			
			
		}
	}

}
