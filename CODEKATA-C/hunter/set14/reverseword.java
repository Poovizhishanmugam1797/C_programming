package CODEKATTAA;
import java.util.ArrayList;
import java.util.Scanner;
class R1
{
	Scanner scan=new Scanner(System.in);
	void getd()
	{
		String s1=scan.nextLine();
		String s2[]=s1.split(" ");
		for(int i=(s2.length-1);i>=0;i--)
		{
			System.out.print(s2[i]+" ");
		}
				
		
		
	}//getd
}//class
		
public class reverse1
{

	
	public static void main(String[] args) 
	{
		
      R1 p=new R1();
      p.getd();
      
	}

}
