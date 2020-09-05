
import java.util.Scanner;

public class OddEvenOperation {

	public static void main(String[] args) {
		//Algorithim
		//1-input size of array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array :");
		int size=sc.nextInt();
		
		//Array size insertion
		int arr[]=new int[size];
		System.out.println("Enter "+ size+" elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//2-display the array value
		System.out.println("The array elemnts that you entered is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		//operation for odd index addition and even index multiplication
		int sum=0,mul=1;
		for (int i= 0;  i< arr.length; i++) {
			//3-check odd index or not
			if(i%2!=0)
				//odd index value addition
				sum=sum+arr[i];
			else
				//even index value multiplication
				mul=mul*arr[i];
			
		}
		//4-print sum of odd index value
		System.out.println("Addition of odd index num is :" +sum);
		//5-pront multiplication of even index value
		System.out.println("multiplication of even index num is "+mul);

	}

}
