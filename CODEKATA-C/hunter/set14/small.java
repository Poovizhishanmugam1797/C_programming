package CODEKATTAA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class S
{
	    Scanner scan=new Scanner(System.in);
	    int n,i,s;
		int a[],a1[],val;
	    
		void getd()
		{
			
		    n=scan.nextInt();
		    //s=scan.nextInt();
			a=new int[n];
				
			
			
			for(i=0;i<a.length;i++)
			   a[i]=scan.nextInt();
			ArrayList<Integer> al=new ArrayList<Integer>();
			ArrayList<Integer> al2=new ArrayList<Integer>();
			
			for(i=0;i<a.length;i++)
				{
				al.add(a[i]);
			    al2.add(a[i]);
				}
			Collections.sort(al);
			Collections.sort(al2);
			Collections.reverse(al2);
			int val1 = 0;
			   for(int i=0;i<a.length;i++)
			   {
                    
				   val=al2.get(i);
				   if(val1==val)
                	{
					   break;
                	}
				   System.out.print(val+" ");
				   
				   val1=al.get(i);
				   if(val1==val)
                  	{
					   break;
                  	}
				   System.out.print(val1+" ");
			
			}
			
				
			   
		}//getd
}//class

		
public class smallest 
{

	
	public static void main(String[] args) 
	
	{
		S p=new S();
		p.getd();

	}

}
