import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

import javax.naming.LinkLoopException;

public class CollectionFrameWork {

	public static void main(String[] args) {
		//Array-List
		ArrayList arrayList=new ArrayList();
		
		//adding object in Array list
		arrayList.add("sunita");
		arrayList.add("puja");
		arrayList.add("b2");
		
		//Display all ArrayList element by get() method
		System.out.println("All ArrayList elements are");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//remove element from ArrayList
		arrayList.remove(2);
		System.out.println("After remove ArrayList elements are");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		//Vector
		Vector v=new Vector();
		//adding object in vector
		v.add("sunita");
		v.add("puja");
		v.add("b2");
				
		//Display all vector element by get() method
		System.out.println("All vector elements are");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.println(v.get(i));
		}
				
		//remove element from vector
		v.remove(2);
		System.out.println("After remove vector elements are");
		for (int i = 0; i < v.size(); i++) 
		{
			System.out.println(v.get(i));
		}
		
		//Link List
		LinkedList linkList=new LinkedList();
		
		//adding object to Link List
		linkList.add("sunita");
		linkList.add("puja");
		linkList.add("b2");
						
		//Display all linkList element by get() method
		System.out.println("All linkList elements are");
		for (int i = 0; i < linkList.size(); i++)
			{
				System.out.println(linkList.get(i));
			}
						
		//remove element from linkList
		linkList.remove(2);
		System.out.println("After remove linkList elements are");
		for (int i = 0; i < linkList.size(); i++) 
			{
				System.out.println(linkList.get(i));
			}
		
		//Stack
		Stack st=new Stack();
		
		//adding object to Stack
		st.push("sunita");
		st.push("puja");
		st.push("b2");
		
		//display stack elements
		System.out.println("All stack elements are :");
		Iterator itr=st.iterator(); 
		{
			while(itr.hasNext())
				System.out.println(itr.next());
		}
		
		//Remove element from stack
		st.pop();//remove last element from the stack
		System.out.println("after remove stack elements are :");
		Iterator itr1=st.iterator(); 
		{
			while(itr1.hasNext())
				System.out.println(itr1.next());
		}
						
	}

}
