import java.util.Scanner;

public class SearchWord {

	public static void main(String[] args) {
		//Algorithim
		//1-input a sentence
		//System.in is a standard input stream
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence :");
		//read string
		String str=sc.nextLine();
		//2-display senetence
		System.out.println("The sentence you have enterd is :"+str);
		//3-enter word that you want to search
		System.out.println("enter the word that you want to search :");
		String search=sc.nextLine();
		
		//indexOf() return index num of specified string
		int index=str.indexOf(search);
		//4-print the index num of given string
		System.out.println(search+" is present at "+index );
		

	}

}
