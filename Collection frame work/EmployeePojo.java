
public class EmployeePojo {
	
	//Attributes for this class
	private String empName;
	private int id;
	
	//setter and getter method
	public String getempName()
	{
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void msg()
	{
		System.out.println("Employee Name : "+empName+" Employee Id : "+id);
	}
	
	
}
