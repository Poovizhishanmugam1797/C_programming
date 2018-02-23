package CODEKATTAA;

import java.util.Scanner;
class L2
{
	Scanner scan=new Scanner(System.in);
	int n;
	void getd()
	{
		n=scan.nextInt();
		if(n%4==0)
			System.out.print("yes");
		else
			System.out.print("no");
		
	}//getd
}//class


public class LEAPNONLEAP
{

	public static void main(String[] args) 
	{
		L2 p=new L2();
		p.getd();
		
	}

}
