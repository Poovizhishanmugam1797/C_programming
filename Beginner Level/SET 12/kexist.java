package cdkatta;
import java.util.*;
class k
{
	Scanner scan=new Scanner(System.in);
	int f=0;
	void getd()
	{
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			if(n2==a[i])
				f=1;
			
			
		}//for
		if(f==1)
			System.out.print("yes");
		else
			System.out.print("no");
		
	}
}
public class kexist
{
   public static void main(String args[])
   {
	   k p=new k();
	   p.getd();
   }
}
