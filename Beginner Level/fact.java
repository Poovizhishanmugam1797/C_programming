import java.util.Scanner;
class fact1
{
	Scanner scan=new Scanner(System.in);
	int n,f=1,n1;
	void getd()
	{
		 n=scan.nextInt();
		 n1=n;
		 for(int i=1;i<n;i++)
			 n1=n1*(n-i);
		 System.out.print(n1);
	}
}

public class fact 
{

	public static void main(String[] args) 
	{
		
fact1 p=new fact1();
p.getd();
	}

}
