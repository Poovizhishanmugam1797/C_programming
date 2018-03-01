package CODEKATTAA;
import java.util.Scanner;

class I
{  Scanner scan=new Scanner(System.in);
	void getd()
	{
		int n=scan.nextInt();
		int a[];
		a=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 a[i]=scan.nextInt();
	    	 
	     }
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.print(a[i]+" " +i+"\n");
	     }//for
	}
}
public class index
{
    Scanner scan=new Scanner(System.in);
    
	public static void main(String[] args)
	{
     
    	 I p=new I();
    	 p.getd();
	}

}
