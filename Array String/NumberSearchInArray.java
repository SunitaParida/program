
import java.util.Scanner;

public class NumberSearchInArray {
public static void main(String args[]) {
	//Algorithim
	//1-input size of array
	Scanner sc=new Scanner(System.in);
	//Array size insertion
	System.out.println("Enter the size of an Array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter "+size+" Elements :");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	//2-Display all values of array
	System.out.println("The array Elements that you enterd is :");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	//3-input number which you want to search 
	int i,found = 0;
	System.out.println("\nEnter the Number that you want to search");
	int searchNum=sc.nextInt();
	
	for( i=0;i<arr.length;i++)
	{
		//4-check number found or not
		if(arr[i]==searchNum)
			{
			//5-if found print the position
			System.out.println(searchNum+" is found in "+(i+1) +" position");
			found=1;
			}
		
	}
	if(found==0)
		
		System.out.println(searchNum+" is not found");
	
}
}
