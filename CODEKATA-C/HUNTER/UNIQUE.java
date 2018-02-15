package CODEKATTAA;
import java.util.Arrays;
import java.util.Scanner;

class u
{
	java.util.Scanner scan=new Scanner(System.in);
	void getd()
	{
	 int a[],b[];
	 int n=scan.nextInt();
	 a=new int[n];
	 b=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=scan.nextInt();
	 }
	 int n1=a.length;
	Arrays.sort(a);
	//for(int i=0;i<(n1);i++)
		//System.out.print(a[i]);
	
	for(int i=0;i<(n-1);i++)
	{
		for(int j=(i+1);j<n;j++)
		 {  
			 if(a[i]==a[j])
		    {
			   a[j]=2;
		    }//if
		 }//for
	}//for
	int k=0;
	
for(int i=0;i<n;i++)
	{
	if(a[i]!=2)
	{
		b[k++]=a[i];
	}//if
	
	}//for

	if(k==n)
	
		System.out.print("unique");
	else
		{
		for(int i=0;i<k;i++)
			System.out.print(b[i]);
		}
	

	
	
	
		
	
	} //getd
}//class
	 
	 
	

public class unique
{

	public static void main(String[] args)
	
	{
		
        u p=new u();
        p.getd();
	}

}
