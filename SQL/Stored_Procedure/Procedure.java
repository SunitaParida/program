
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.util.Scanner;
		import java.sql.Statement;



		public class Procedure {

			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.jdbc.Driver");

				//Create connecton
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","root");
				System.out.println("Please enter 1 to insert data 2 to view all the record & 3 for Delete data & 4 for Update data : ");
				int input = new Scanner(System.in).nextInt();

				//switch case what operation You want to perform
				switch (input) {
				case 1:
				
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
					//insert data by stored procedure
				PreparedStatement ps=cn.prepareStatement("call Student_Data('INSERT',?,?,?,?,?,?)");
				
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
				break;
				case 2:
				//fetch data by stored procedure
					String query = "call Student_Data('FETCH',Null,'','','','',Null);";
					Statement stmnt =cn.createStatement();
				ResultSet rs= stmnt.executeQuery(query);
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
			case 3:
				System.out.println("Enter Reg NO That you want to delete :");
				int rNo=new Scanner(System.in).nextInt();
				PreparedStatement ps2=cn.prepareStatement("select * from data where intRegNo=(?)");
				ps2.setInt(1, rNo);
				ResultSet rs1= ps2.executeQuery();
				if(!rs1.next())
				{
					System.out.println("Given regno not found");
					
				}
				else
				{
					//delete data by stored procedure
					PreparedStatement ps3=cn.prepareStatement("call Student_Data('DELETE',Null ,'','','','',Null) ");
					
					int delete=ps3.executeUpdate();
					System.out.println(rNo+" Registration num data is deleted");
				}
				break;
			case 4:
				System.out.println("Enter Reg NO That you want to Update :");
				int regNo=new Scanner(System.in).nextInt();
				PreparedStatement ps4=cn.prepareStatement("select * from data where intRegNo=(?)");
				ps4.setInt(1, regNo);
				ResultSet rs2= ps4.executeQuery();
				if(!rs2.next())
				{
					System.out.println("Given regno not found");
					
				}
				else
				{
					System.out.println("Enter RegNo :");
					int uRegNo=new Scanner(System.in).nextInt();
					
					System.out.println("Enter first name");
					String uFnm=new Scanner(System.in).nextLine();
					
					System.out.println("enter last name");
					String uLnm=new Scanner(System.in).nextLine();
					
					System.out.println("Enter phone number :");
					String uPh=new Scanner(System.in).nextLine();
					
					System.out.println("Enter Address :");
					String uAdr=new Scanner(System.in).nextLine();
					
					System.out.println("Enter pin :");
					int uPin=new Scanner(System.in).nextInt();
					
					//update data by stored procedure
					PreparedStatement ps3=cn.prepareStatement("call Student_Data('Update',?,?,?,?,?,?) ");
					
					ps3.setInt(1, uRegNo);
					ps3.setString(2, uFnm);
					ps3.setString(3, uLnm);
					ps3.setString(4, uPh);
					ps3.setString(5, uAdr);
					ps3.setInt(6, uPin);
					
					int update=ps3.executeUpdate();
					if(update>0)
					System.out.println(regNo+" Registration num data is updated");
					break;
				}
				}
				}catch (Exception e) {
				System.out.println(e);
				}
			}

		}
