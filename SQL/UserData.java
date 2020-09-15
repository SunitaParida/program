import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserData {

public static void main(String args[])
{
	try {
		Class.forName("com.mysql.jdbc.Driver");

	//Create connecton
	Class.forName("com.mysql.jdbc.Driver");
	Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","root");

	//how many data insert
	System.out.println("please enter how many data you want to insert: ");
	int size=new Scanner(System.in).nextInt();
	
	for(int i=1;i<=size;i++)
	{
		System.out.println("Record No : "+i);
		System.out.println("**************");
		System.out.println("Enter RegNo :");
		int regNo=new Scanner(System.in).nextInt();
		
		System.out.println("Enter first name");
		String fnm=new Scanner(System.in).nextLine();
		
		System.out.println("enter last name");
		String lnm=new Scanner(System.in).nextLine();
		
		System.out.println("Enter phone number :");
		String ph=new Scanner(System.in).nextLine();
		
		System.out.println("Enter Address :");
		String adr=new Scanner(System.in).nextLine();
		
		System.out.println("Enter pin :");
		int pin=new Scanner(System.in).nextInt();
		
		//preparedstatement interface is a sub interface of statement used to execute parametrised query
	PreparedStatement ps=cn.prepareStatement("insert into data values(?,?,?,?,?,?)");
	
	//Specify the parameter in the query
	ps.setInt(1, regNo);
	ps.setString(2, fnm);
	ps.setString(3, lnm);
	ps.setString(4, ph);
	ps.setString(5, adr);
	ps.setInt(6, pin);
	int ex=ps.executeUpdate();
	if(ex==1)
	{
	System.out.println(i+" record is inserted");
	}
	System.out.println("**************");
	}
System.out.println("Please enter 1 to view all the record & 2 for exit: ");
int input = new Scanner(System.in).nextInt();

//switch case what operation You want to perform
switch (input) {
case 1:
	PreparedStatement ps1=cn.prepareStatement("select * from data");
	ResultSet rs= ps1.executeQuery();
	while(rs.next())
	{
	int regno=rs.getInt("intRegNo");
	String firstNm=rs.getString("varStudentFirstName");
	String lastNm=rs.getString("varStudentLastName");
	String phno=rs.getString("varPhNo");
	String addrs=rs.getString("varAddress");
	int pin=rs.getInt("intpin");
	System.out.println("reg no : "+regno+" First name : "+firstNm+" Last name : "+lastNm+" Phone no : "+phno+" Address : "+addrs+" pin : "+pin);
	System.out.println("____________________________________________________________");
	}
	break;
case 2:
	System.exit(0);
	break;

	
}
	}catch (Exception e) {
	System.out.println(e);
	}
}
}
