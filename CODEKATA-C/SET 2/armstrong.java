package CODEKATTAA;

import java.util.Scanner;
class t4
{
      Scanner scan=new Scanner(System.in);
      double sum=0;
    		  
      void getd()
      {
    	  int n1=scan.nextInt();
    	  int m=n1;
    	  while(n1>0)
    	  {
    		   int r=n1%10;
    		   sum=sum+Math.pow(r, 3);
    		   n1=n1/10;
    	  }
    	  //System.out.print(sum);
    	  if(m==sum)
    		  System.out.print("\nYes");
    	  else
    		  System.out.print("\nNo");
      }//getd
    		   
    		  
}//class 
    	  
    	  
public class armstrong 
{

	public static void main(String[] args) 
	{
		
     t4 p=new t4();
     p.getd();
	}

}
