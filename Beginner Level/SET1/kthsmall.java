import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class s
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
		al.add(a[i]);
	Collections.sort(al);
	
		val=al.get(n1-1);
		System.out.print(val);
		
		
		
		
	
	    
		
}//getd
}//class
public class kthsmall {

	public static void main(String[] args) {
		s p=new s();
		p.getd();

	}

}
