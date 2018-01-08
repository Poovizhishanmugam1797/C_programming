package CODEKATTAA;
import java.io.*;
import java.util.Scanner;
class E
{
	Scanner scan=new Scanner(System.in);
	void getd()
	{
		String s=scan.nextLine();
		
		StringBuilder b=new StringBuilder(s);
		String s1=b.reverse().toString();
		System.out.print(s1);
		if(s1.equals(s))
		{
			System.out.print("\nyes");
		}
		else
			System.out.print("\nno");
	}//getd
}//class
		
		
public class reverse 
{

	public static void main(String[] args)
	
	{
		
    E p=new E();
    p.getd();
    
	}

}
