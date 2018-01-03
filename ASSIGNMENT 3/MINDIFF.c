#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>

int main(void)
{
	int a[10],n,i,j,k=0,min,b[20],c,q;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	  scanf("%d",&a[i]);
    min=a[0];
	for(i=0;i<(n-1);i++)
	  {
	   for(j=(i+1);j<n;j++)  
	      {
		  b[k]=abs(a[i]-a[j]);
		  if(b[k]<min)
		     {
			 min=b[k];
		     c=a[i];
		     q=a[j];
		     }//if
		     
		  
	      k++;
	      } //for
	  }//for
	 printf("%d %d",c,q);
	 return 0;
	      
}//main
	  
