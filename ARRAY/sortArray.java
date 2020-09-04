

import java.util.Scanner;

public class sortArray {
	public static void main(String args[]) {
		
		  //System.in is a standard input stream
			Scanner sc=new Scanner(System.in);
			
		  //length of an array 
			System.out.print("Enter length of an array:"); 
			 int size =sc.nextInt();
			int arr[] = new int[size+1];
		    System.out.println("Enter "+size+" elements:");
		    for(int i = 0; i < size; i++)
		  { arr[i] = sc.nextInt(); } 
		    int temp;
		  //display array value
		  System.out.print("the array You entered is :"); 
		  for (int i = 0; i <arr.length-1;i++) 
		  { System.out.print(" "+arr[i]); }
		  
		System.out.println("\nPlease enter 1 for bubble Sort \n 2 for insertion sort\n 3 for selection sort\n 4 for quick  sort: ");
		int input = new Scanner(System.in).nextInt();
		//switch case what operation You want to perform
		switch (input) { 
		case 1:
			//This is for bubble sort
			
			
		//This loop is for iteration/rounds
		for(int i=1;i<arr.length;i++)
		{
			//this for loop for compare adjacent elemnt,upto sorted
			for(int j=0;j<arr.length-i;j++)
			{
				//compare 1st adjacent element with 2nd adjacent element
				if(arr[j]>arr[j+1])
				{
					//if condition is true then swap
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
		//display array after sorting
		System.out.println("After sorting");
		for(int i=1;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		break;
		case 2:
			//This is for insertion sort
			//this loop start from 2nd index i.e index no 1
			for(int i=1; i<arr.length;i++)
			{
				 temp=arr[i];
				 //here we initialize the value of i to j because if we changes something in i then it will affect to our for loop
				int j=i;
				while(j>0 && arr[j-1]>temp)
				{
					arr[j]=arr[j-1];
					j=j-1;
				}
				arr[j]=temp;
			}
			
			//display array after sorting
			System.out.println("After sorting");
			for(int i=1;i<arr.length;i++)
			{
				System.out.print(arr[i]+ " ");
			}
			break;
		case 3:
			//This is for selection sort
			
			for(int i=0;i<arr.length-1;i++)
			{
				int min=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						min=j;
					}
				}
				temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			
			//display array after sorting
			System.out.println("After sorting");
			for(int i=1;i<arr.length;i++)
			{
				System.out.print(arr[i]+ " ");
			}
			break;
		case 4:
			//This is for quick sort
			
			int length=arr.length;
			sortArray sa=new sortArray();
			sa.quickSort(arr, 0, length-1);
			
			//Display array
			System.out.println("After sorting");
				for (int i=1;i<arr.length;i++) 
				{
					System.out.print(arr[i]+" ");
				}
				break;
		
			
	}
	}
	
	void quickSort(int arr[],int low,int high)
	{
		int i,j,p,t;
		i=low;
		j=high;
		
		//p is the middle point
		p=arr[(low+high)/2];
		
		//loop till i has not crossed j
		do
		{
			//loop till arr[i] vale is <p i.e mdl
			while(arr[i]<p)
				i++;
			//loop till arr[j] vale is > p i.e mdl
			while(arr[j]>p)
				j--;
			//if i has not crossed j
			if(i<=j)
			{
				//swap arr[i] with arr[j]
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				//after swap increment i
				i++;
				//after swap decrement j
				j--;
			}
		}while(i<=j);
		
		//if more than one element in 1st list
		if(low<j)
			//call quickSort from low upto j
			quickSort(arr, low, j);
		
		//if more than one element in 1st list
		if(i<high)
			//call quickSort from i upto high
			quickSort(arr, i, high);
	}
	
	
}
