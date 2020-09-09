import java.util.Arrays;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class FindDuplicateElement {

	public static void main(String[] args) {
		//System.in is a standard input stream
		Scanner sc=new Scanner(System.in);
		
	  //length of an array 
		System.out.print("Enter length of an array:"); 
		 int size =sc.nextInt();
		int[] arr = new int[size];
	    System.out.println("Enter "+size+" elements:");
	    for(int i = 0; i < size; i++)
	  { arr[i] = sc.nextInt(); } 
		
	    
		//create map
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();

		for(int key :arr)
		{
			//get() return the object that contains the value associated with the key 
			Integer count=map.get(key);
			map.put(key, (count==null)?1:count + 1);
			
		}
		
		//entrySet() it returns the set view containing all the keys and values
		for(Entry<Integer, Integer> show: map.entrySet())
		{
			System.out.println(show.getKey()+" present - "+show.getValue()+ " time");
		}
		
	
}
}