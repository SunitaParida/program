

import java.util.Scanner;

public class ArrayExample {
public static void main(String args[]) {
		
	System.out.println("Please enter 1 for single dimensional array & 2 for multi  dimensional array: ");
	int input = new Scanner(System.in).nextInt();
	//switch case what operation You want to perform
	switch (input) { 
	case 1:
		 
		  //single Dimensional array 
		int size,n, temp;
		
		  //System.in is a standard input stream
			Scanner sc=new Scanner(System.in);
			
		  //length of an array 
			System.out.print("Enter length of an array:"); 
			 size =sc.nextInt();
			int arr[] = new int[size+1];
		    System.out.println("Enter "+size+" elements:");
		    for(int i = 0; i < size; i++)
		  { arr[i] = sc.nextInt(); } 
		    
		  //display array value
		  System.out.print("the array You entered is :"); 
		  for (int i = 0; i <arr.length-1;i++) 
		  { System.out.print(" "+arr[i]); }
		  
		  System.out.println("\n Please enter 3 for ascending order & 4 for descending order: ");
			int input1 = new Scanner(System.in).nextInt();
			//switch case what operation You want to perform ascending or descending
			switch (input1) { 
			case 3:
		  //sorting array in ascending order
		  for (int i = 0; i < size; i++) 
	        {
	            for (int j = i + 1; j < size; j++) 
	            {
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.print("\nAscending Order:");
	        for (int i = 0; i < size - 1; i++) 
	        {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.print(arr[size - 1]);
		  break;
			case 4:
				//sorting array in descending order
				  for (int i = 0; i < size; i++) 
			        {
			            for (int j = i + 1; j < size; j++) 
			            {
			                if (arr[i] < arr[j]) 
			                {
			                    temp = arr[i];
			                    arr[i] = arr[j];
			                    arr[j] = temp;
			                }
			            }
			        }
			        System.out.print("\n Descending Order:");
			        for (int i = 0; i < size - 1; i++) 
			        {
			            System.out.print(arr[i] + ",");
			        }
			        System.out.print(arr[size - 1]);
				  break;
			}
			break;
	case 2:
			// Multi Dimensional array  
		       Scanner sc1=new Scanner(System.in);
		       System.out.print("Enter array size for row : ");
		       int rows=sc1.nextInt();
		       System.out.print("Enter array size for column : ");
		       int columns=sc1.nextInt();
		       
		       System.out.println("Enter array elements : ");    
		        
		       int twoD[][]=new int[rows][columns];
		        
		        for(int i=0; i<rows;i++)
		         {            
		            for(int j=0; j<columns;j++)
		            {
		                twoD[i][j]=sc1.nextInt();
		            }
		         }
		        System.out.print("\nData you entered : \n");
		        //Display array values
		        for(int []x:twoD){
		            for(int y:x){
		            System.out.print(y+"   ");
		            }
		            System.out.println();
		        }
		        System.out.println("\n Please enter 5 for ascending order & 6 for descending order: ");
				int input2 = new Scanner(System.in).nextInt();
				//switch case what operation You want to perform ascending or descending
				switch (input2) { 
				case 5:
					
		      //sorting multi dimensional array in ascending order
		      for(int x=0;x<rows;x++)
		      {
		    	  for(int y=0;y<columns;y++)
		    	  {
		    		  //this loop is for comparing other values
		    		  for(int i=0;i<rows;i++)
		    		  {
		    			  for(int j=0;j<columns;j++)  
		    			  {
		    				  if(twoD[i][j] > twoD[x][y])
		    				  {
		    					  temp=twoD[x][y];
		    					  twoD[x][y]=twoD[i][j];
		    					  twoD[i][j]=temp;
		    				  }
		    			  }
		    		  }
		    	  }
		      }
		      System.out.print("\nafter Sorting the array is: \n");
		        //Display array values
		        for(int []x:twoD){
		            for(int y:x){
		            System.out.print(y+"   ");
		            }
		            System.out.println();
		        }
		   
		        break;
		      
				case 6:
					
				      //sorting multi dimensional array in descending order
				      for(int x=0;x<rows;x++)
				      {
				    	  for(int y=0;y<columns;y++)
				    	  {
				    		  for(int i=0;i<rows;i++)
				    		  {
				    			  for(int j=0;j<columns;j++)  
				    			  {
				    				  if(twoD[i][j] < twoD[x][y])
				    				  {
				    					  temp=twoD[x][y];
				    					  twoD[x][y]=twoD[i][j];
				    					  twoD[i][j]=temp;
				    				  }
				    			  }
				    		  }
				    	  }
				      }
				      System.out.print("\nafter Sorting the array is: \n");
				        //Display array values
				        for(int []x:twoD){
				            for(int y:x){
				            System.out.print(y+"   ");
				            }
				            System.out.println();
				        }
				   
				        break;
		  }
}
}
}
