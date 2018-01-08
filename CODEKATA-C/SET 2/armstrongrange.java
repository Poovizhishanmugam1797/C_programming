package CODEKATTAA;

import java.util.Scanner;
class t4
{
      Scanner scan=new Scanner(System.in);
      //double sum=0;
    		  
      void getd()
      {
          int n1=scan.nextInt();int n2=scan.nextInt();
         
    	  for(int i=(n1+1);i<n2;i++)
    	  {
    	double sum=0;   
    	  int m=i;
    	  while(m>0)
    	  {
    		   int r=m%10;
    		   sum=sum+Math.pow(r, 3);
    		   m=m/10;
    	  }
    	  //System.out.print("\n"+sum);
    	  
    	  if(i==sum)
    		  System.out.print(sum+" ");
    	  else
    		  continue;
    	  }//for
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
