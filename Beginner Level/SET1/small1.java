import java.util.Scanner;
class D
{
	Scanner scan=new Scanner(System.in);
	int a[],max,min,n;
	D(int m)
	{
		 n=m;
		 a=new int[n];
		
			min=0;
		
	}//constructor
	void getd()
	{
		
		for(int i=0;i<n;i++)
		
			a[i]=scan.nextInt();
	}//getd
	void process()
	{
		int i; 
	
		min=a[0];
		for(i=1;i<n;i++)
			{
			
			if(a[i]<min)
				min=a[i];
			}
	}//process
	void result()
	{
		
		System.out.print(+min);
	}//result
}//class		

public class small
{


	public static void main(String[] args) 
	{
		int k,ch;
     	D p1;
     	Scanner scan=new Scanner(System.in);
     	ch=scan.nextInt();
     	p1=new D(ch);
     	p1.getd();
     	p1.process();
     	p1.result();
     	
     	
     		
 	

	}

}


		
