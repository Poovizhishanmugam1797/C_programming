#include<stdio.h>
int main()
{
	int n,temp,d;
	scanf("%d",&n);
	scanf("%d",&d);
	int a[n],i;
	for(i=0;i<n;i++)
	   scanf("%d",&a[i]);
	 int j;
	 j=0;  
	while(j<d)  
	{
	     temp=a[0];
	     for(i=0;i<(n-1);i++)
	         a[i]=a[i+1];
	     a[n-1]=temp;
	     j++;
	}//while
	for(i=0;i<n;i++)
	
	    printf("%d",a[i]);
	return 0;    
}//MAIN
	
 
	    
	   
