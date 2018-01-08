package CODEKATTAA;
import java.io.*;
import java.util.Scanner;

class t2
{
      Scanner scan=new Scanner(System.in);
      void getd()
      {
    	  int n1=scan.nextInt();int n2=scan.nextInt();
    	  
    	  for(int i=(n1+1);i<n2;i++)
    		  {
    		  if(i%2==0)
    			  System.out.print(i+" ");
    		 else
    			 continue;
 
    		  }//for
      }//getd
    	  
    	  
    	  
    	  
}//class
    	  
    	  
public class oddintervals {

	
	public static void main(String[] args)
	
	{
		t2 p=new t2();
		p.getd();
	}

}
