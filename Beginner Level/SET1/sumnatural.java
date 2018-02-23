import java.util.Scanner;
class Sum
{
	Scanner scan=new Scanner(System.in);
	int sum=0;
	void getd()
	{
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
			sum=sum+i;
		System.out.print(sum);
	}
}
public class sumnatural
{

	
	public static void main(String[] args)
	{
		
Sum p=new Sum();
p.getd();
	}

}
