import java.util.Scanner;
class M
{
     Scanner scan=new Scanner(System.in);
	int mul=0;
	
	void getd()
	{
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
			{mul=n+mul;
			System.out.print(mul+" ");}
	}
}//class
public class Multiple {
	public static void main(String[] args) {
	
M p=new M();
p.getd();
	}

}
