#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
int main(void)
{
    int a[10],n,i,k=0,b[20],c[20],count=0,count1=0,even,odd;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	  scanf("%d",&a[i]);
	int j=0;
	for(i=0;i<n;i++)  
	 {
	  if(a[i]%2==0)
	    {
		 even=a[i];
		 count=count+1;
	    }//if
	 else
	    {
		odd=a[i];
	    count1=count1+1;
	   }
	   
    }//for

	if(count1==1)
	   printf("%d",odd);
	if(count==1)
	   printf("%d",even);   
	}//main
