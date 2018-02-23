import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class s1
{
Scanner scan=new Scanner(System.in);
int a[],val;
ArrayList<Integer> al=new ArrayList<Integer>();
void getd()
{
	int n=scan.nextInt();
	a=new int[n];
	int n1=scan.nextInt();
	for(int i=0;i<n;i++)
		a[i]=scan.nextInt();
	for(int i=0;i<n;i++)
		{
		if(a[i]%2!=0)
			al.add(a[i]);
		}
	
		val=al.get(n1-1);
		
		System.out.print(val);
	
	    
		
}//getd
}//class


public class kthodd {

	
	public static void main(String[] args) {
		s1 p=new s1();
		p.getd();
		

	}

}
