import java.util.Scanner;
class C
{
	String s[];
	String s1[];
	String s2[];
	Scanner scan=new Scanner(System.in);
	void getd()
	{
		s=scan.nextLine().toLowerCase().split(" ");
		for(int i=0;i<s.length;i++)
		System.out.print(s[i].substring(0,1).toUpperCase().toString()+s[i].substring(1)+" ");
		
		
			
			
	}
}
public class capitalfirst 
{


	public static void main(String[] args) 
	{
	C p=new C();
	p.getd();
	}

}
