package CODEKATTAA;
import java.util.Scanner;
class C
{
	void getd()
	{
		Scanner scan=new Scanner(System.in);
		String s1,s2;
		s1=scan.nextLine();
		s2=scan.nextLine();
		String s3=s1.concat(s2);
		System.out.print(s3);
	}
}//class		
		
		
public class concat
{

	
	public static void main(String[] args)
	{
		
		C p=new C();
	p.getd();
	}

}
