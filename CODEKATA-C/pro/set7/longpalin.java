package CODEKATTAA;
import java.util.Scanner;
class L
{
	
	Scanner scan=new Scanner(System.in);
	int j;
	String s2,s4;
	
	void getd()
	{
		
		String s=scan.nextLine();
		char a[]=s.toCharArray();
		int max=0;
		for(int i=0;i<(a.length-1);i++)
		{
			for(j=i+1;j<(a.length);j++)
			{
				if(a[i]==a[j])
					{
					
					s2=s.substring(i, j+1);
					StringBuffer s3=new StringBuffer(s2);
					StringBuffer s6=new StringBuffer();
					s4=s2;
				    
				    s3.reverse();
				    if(s2.equals(s3.toString()))
				    {
				        s6.append(s3);
				    	if(s2.length()>max)
				    	
				    		max=s2.length();
				        
				   // System.out.print(s6);
				    //System.out.print(s4+"\n");
				    }
					}//if
    
				}//for
			}//for
		System.out.print(s.length()-max);
}//getd	

}//L

public class longpalindromeremove 
{

	public static void main(String[] args) 
	{
		
         L p=new L();
         p.getd();
	}

}
