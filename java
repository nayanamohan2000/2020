package program2b;
import java.util.Scanner;
import java.util.StringTokenizer;

public class customer {
	String name,dob;
	Scanner scannerobj=new Scanner(System.in);
	
	public void readData()
	{
		System.out.println("enter name\n");
		name=scannerobj.nextLine();
		System.out.println("enter date of birth\n");
		dob=scannerobj.nextLine();
	}
	public void displayData()
	{
		System.out.println("Tokenized");
		StringTokenizer st=new StringTokenizer(dob,"/");
		System.out.print(name);
		while(st.hasMoreTokens())
		{
			System.out.println(","+st.nextToken());
		}
	}
}package program2b;
import java.util.Scanner;
public class customermain 

{
	public static void main(String[] args)
	{
		customer obj=new customer();
		obj.readData();
		obj.displayData();
		
	}

