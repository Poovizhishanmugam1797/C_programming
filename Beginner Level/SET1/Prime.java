import java.util.Scanner;

class Prime
{
	Scanner scan=new Scanner(System.in);
		void getd()
		{
			int n=scan.nextInt();
			if((n==2)||(n%2!=0))
			   System.out.print("yes");
			else
			   System.out.print("no");
		}
	
}
public class PrimenotPrime 
{

	public static void main(String[] args)
	{
		
    Prime p=new Prime();
    p.getd();
	}

}
