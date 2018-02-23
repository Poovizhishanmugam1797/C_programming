package CODEKATTAA;
import java.util.Scanner;
class L1
{
	Scanner scan=new Scanner(System.in);
	int a[],max;
	void getd()
	{
		int n=scan.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			
		}//for
		System.out.print(max);
	}//getd
}//class
public class laragest 
{

	public static void main(String[] args)
	{
		
L1 p=new L1();
p.getd();
	}

}
